from flask import Blueprint, request, jsonify
from models import Patient
from app import db

patients_bp = Blueprint('patients', __name__, url_prefix='/api/patients')

@patients_bp.route('', methods=['GET'])
def get_patients():
    patients = Patient.query.all()
    return jsonify([{'id': p.id, 'name': p.name} for p in patients])

@patients_bp.route('', methods=['POST'])
def add_patient():
    data = request.get_json()
    patient = Patient(name=data['name'], phone=data['phone'])
    db.session.add(patient)
    db.session.commit()
    return jsonify({'message': 'Patient added'})
