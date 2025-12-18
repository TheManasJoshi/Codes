from flask import Blueprint, request, jsonify, session
from app import db
from models import Staff

staff_bp = Blueprint('staff', __name__, url_prefix='/api/staff')


# -------------------------
# Get all staff
# -------------------------
@staff_bp.route('', methods=['GET'])
def get_staff():
    staff_members = Staff.query.all()
    return jsonify([
        {
            'id': s.id,
            'name': s.name,
            'role': s.role,
            'phone': s.phone
        } for s in staff_members
    ])


# -------------------------
# Add staff member
# -------------------------
@staff_bp.route('', methods=['POST'])
def add_staff():
    data = request.get_json()

    if not data or not data.get('name') or not data.get('role'):
        return jsonify({'error': 'Missing required fields'}), 400

    staff = Staff(
        name=data['name'],
        role=data['role'],
        phone=data.get('phone'),
        email=data.get('email')
    )

    db.session.add(staff)
    db.session.commit()

    return jsonify({'message': 'Staff member added successfully'}), 201


# -------------------------
# Delete staff member
# -------------------------
@staff_bp.route('/<int:staff_id>', methods=['DELETE'])
def delete_staff(staff_id):
    staff = Staff.query.get_or_404(staff_id)
    db.session.delete(staff)
    db.session.commit()
    return jsonify({'message': 'Staff member deleted'})
