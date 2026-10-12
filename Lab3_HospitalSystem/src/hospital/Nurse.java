package hospital;

public class Nurse extends Person {
    private String department;
    private String shift;

    public Nurse(int personId, String name, int age, String department, String shift) {
        super(personId, name, age);
        this.department = department;
        this.shift = shift;
    }

    public void assistPatient() {
        System.out.println("Nurse " + getName() + " is assisting a patient in " + department + ".");
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " + getName() + " is monitoring patients during the " + shift + " shift.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department + " | Shift: " + shift);
    }

    public String getDepartment() { return department; }
    public String getShift()      { return shift; }
}