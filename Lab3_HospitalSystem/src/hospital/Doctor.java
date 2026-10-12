package hospital;

public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age,
                  String specialization, double consultationFee) {
        super(personId, name, age);   // calls Person's constructor; must be the first line
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public void diagnosePatient() {
        System.out.println("Dr. " + getName() + " is diagnosing a patient in " + specialization + ".");
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is consulting patients.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();          // reuse Person's output, then add Doctor's details
        System.out.println("Specialization: " + specialization + " | Fee: $" + consultationFee);
    }

    public String getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }
}