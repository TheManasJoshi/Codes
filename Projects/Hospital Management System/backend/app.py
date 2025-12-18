from flask import Flask
from flask_sqlalchemy import SQLAlchemy


db = SQLAlchemy()

def create_app():
    app = Flask(__name__)
    app.config.from_object('config.Config')

    db.init_app(app)

    from routes.auth import auth_bp
    from routes.patients import patients_bp
    from routes.staff import staff_bp
    from routes.appointments import appointments_bp
    from routes.medicines import medicines_bp
    from routes.billing import billing_bp
    from routes.analytics import analytics_bp
    from routes.records import records_bp

    app.register_blueprint(auth_bp)
    app.register_blueprint(patients_bp)
    app.register_blueprint(staff_bp)
    app.register_blueprint(appointments_bp)
    app.register_blueprint(medicines_bp)
    app.register_blueprint(billing_bp)
    app.register_blueprint(analytics_bp)
    app.register_blueprint(records_bp)

    return app
