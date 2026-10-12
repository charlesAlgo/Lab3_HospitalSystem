package hospital;

public class MainDriver {
    public static void main(String[] args) {

        // ---------- 1. Objects & details ----------
        System.out.println("===== HOSPITAL STAFF DETAILS =====");
        Doctor doctor = new Doctor(101, "Sarah Lee", 45, "Cardiology", 200.00);
        Nurse nurse = new Nurse(102, "James Brown", 32, "Pediatrics", "Night");
        Surgeon surgeon = new Surgeon(103, "Amir Khan", 50, "Orthopedics", 350.00, "Knee Replacement", "OR-3");
        EmergencyDoctor erDoctor = new EmergencyDoctor(104, "Linda Park", 38, "Emergency Medicine", 250.00);

        System.out.println("\n-- Doctor --");          doctor.displayInfo();
        System.out.println("\n-- Nurse --");           nurse.displayInfo();
        System.out.println("\n-- Surgeon --");         surgeon.displayInfo();
        System.out.println("\n-- Emergency Doctor --"); erDoctor.displayInfo();

        // ---------- 2. Specialized methods ----------
        System.out.println("\n===== SPECIALIZED METHODS =====");
        doctor.diagnosePatient();
        nurse.assistPatient();
        surgeon.performSurgery();
        surgeon.diagnosePatient();     // inherited from Doctor (multilevel)
        erDoctor.handleEmergency();

        // ---------- 3. Method overriding ----------
        System.out.println("\n===== METHOD OVERRIDING =====");
        doctor.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoctor.performDuties();

        // ---------- 4. Polymorphism ----------
        System.out.println("\n===== POLYMORPHISM (Person reference) =====");
        Person person;

        person = new Doctor(201, "Mark Ford", 40, "Neurology", 220.00);
        person.performDuties();

        person = new Nurse(202, "Grace Ali", 29, "ICU", "Day");
        person.performDuties();

        person = new Surgeon(203, "Tom Reid", 55, "Cardiothoracic", 400.00, "Bypass", "OR-1");
        person.performDuties();

        person = new EmergencyDoctor(204, "Nina Cole", 36, "Trauma", 260.00);
        person.performDuties();

        // ---------- 5. Interfaces ----------
        System.out.println("\n===== INTERFACE METHODS =====");
        erDoctor.prescribeMedication();
        erDoctor.generateBill();

        MedicalProfessional mp = erDoctor;   // interface reference = interface polymorphism
        mp.prescribeMedication();
        Billable b = erDoctor;
        b.generateBill();
    }
}