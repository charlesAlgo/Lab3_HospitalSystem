package hospital;

public class Surgeon extends Doctor {
    private String surgeryType;
    private String operatingRoom;

    public Surgeon(int personId, String name, int age, String specialization,
                   double consultationFee, String surgeryType, String operatingRoom) {
        super(personId, name, age, specialization, consultationFee); // goes to Doctor, which goes to Person
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public void performSurgery() {
        System.out.println("Dr. " + getName() + " is performing " + surgeryType
                + " surgery in " + operatingRoom + ".");
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is preparing for surgery.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();   // prints Person's line + Doctor's line
        System.out.println("Surgery Type: " + surgeryType + " | Operating Room: " + operatingRoom);
    }

    public String getSurgeryType()   { return surgeryType; }
    public String getOperatingRoom() { return operatingRoom; }
}