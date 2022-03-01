public class Person {

    private final int id;
    private String name;
    private int birthYear;

    static int nextId = 1;

    public Person(String name, int birthYear) {
        this.id = nextId++;
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void display() {
        System.out.println("Person");
        System.out.println("\t" + "id: " + getId());
        System.out.println("\t" + "Name: " + getName());
        System.out.println("\t" + "Year of birth: " + getBirthYear());
        System.out.println("\t" + "Cars:");
    }
}
