package Sheikh;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int birthYear;
    /**
     * Constructor to initialize the Person object with provided values.
     *
     * @param id       Unique identifier for the person.
     * @param name     First name of the person.
     * @param surname  Last name of the person.
     * @param birthYear Birth year of the person.
     */

    public Person(int id, String name, String surname, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "--Person--" +
                "\nid=" + id +
                "\nname=" + name +
                "\nsurname=" + surname +
                "\nbirthYear=" + birthYear;
    }
}