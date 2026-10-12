package hospital;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
    private static final double EMERGENCY_SURCHARGE = 150.00;

    public EmergencyDoctor(int personId, String name, int age,
                           String specialization, double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println("Dr. " + getName() + " is handling an emergency case in the ER.");
    }

    @Override
    public void prescribeMedication() {   // from MedicalProfessional
        System.out.println("Dr. " + getName() + " prescribed emergency medication.");
    }

    @Override
    public void generateBill() {          // from Billable
        double total = getConsultationFee() + EMERGENCY_SURCHARGE; // inherited getter from Doctor
        System.out.println("Bill: Consultation $" + getConsultationFee()
                + " + Emergency surcharge $" + EMERGENCY_SURCHARGE + " = $" + total);
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is on duty in the Emergency Room.");
    }
}