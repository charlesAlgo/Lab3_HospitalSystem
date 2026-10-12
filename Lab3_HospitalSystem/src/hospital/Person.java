package hospital;

public class Person {
    // private = encapsulation: only reachable through getters
    private int personId;
    private String name;
    private int age;

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public void performDuties() {
        System.out.println(name + " is performing general hospital duties.");
    }

    public void displayInfo() {
        System.out.println("ID: " + personId + " | Name: " + name + " | Age: " + age);
    }

    public int getPersonId() { return personId; }
    public String getName()  { return name; }
    public int getAge()      { return age; }
}