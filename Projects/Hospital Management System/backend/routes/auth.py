from flask import Blueprint, request, jsonify, session
from werkzeug.security import generate_password_hash, check_password_hash
from app import db
from models import User

auth_bp = Blueprint('auth', __name__, url_prefix='/api/auth')


# -------------------------
# Register User
# -------------------------
@auth_bp.route('/register', methods=['POST'])
def register():
    data = request.get_json()

    if not data or not data.get('email') or not data.get('password'):
        return jsonify({'error': 'Missing fields'}), 400

    existing_user = User.query.filter_by(email=data['email']).first()
    if existing_user:
        return jsonify({'error': 'User already exists'}), 409

    user = User(
        name=data.get('name'),
        email=data['email'],
        role=data.get('role', 'Admin'),
        password=generate_password_hash(data['password'])
    )

    db.session.add(user)
    db.session.commit()

    return jsonify({'message': 'User registered successfully'}), 201


# -------------------------
# Login User
# -------------------------
@auth_bp.route('/login', methods=['POST'])
def login():
    data = request.get_json()

    if not data or not data.get('email') or not data.get('password'):
        return jsonify({'error': 'Missing credentials'}), 400

    user = User.query.filter_by(email=data['email']).first()

    if not user or not check_password_hash(user.password, data['password']):
        return jsonify({'error': 'Invalid email or password'}), 401

    session['user_id'] = user.id
    session['role'] = user.role

    return jsonify({
        'message': 'Login successful',
        'user': {
            'id': user.id,
            'name': user.name,
            'role': user.role
