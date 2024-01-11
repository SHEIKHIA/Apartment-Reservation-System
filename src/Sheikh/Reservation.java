package Sheikh;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Represents a reservation with details such as name, surname,
 * start date, duration, cost, and associated persons.
 * @author sheikhishtiakahmed
 * @version 2nd May 2020
 */
public class Reservation {
    private int id;
    private String name;
    private String surname;
    private LocalDate startDate;
    private int duration;
    private double cost;
    ArrayList<Person> persons;
    /**
     * Constructor to initialize the Reservation object with provided values.
     *
     * @param id       Unique identifier for the reservation.
     * @param name     First name of the person making the reservation.
     * @param surname  Last name of the person making the reservation.
     * @param startDate Start date of the reservation.
     * @param duration Duration of the reservation in days.
     * @param cost     Cost of the reservation.
     */

    public Reservation(int id, String name, String surname,
                       LocalDate startDate, int duration, double cost) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.startDate = startDate;
        this.duration = duration;
        this.cost = cost;
        this.persons = new ArrayList<>();
    }

    // Getter methods for accessing reservation details
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    @Override
    public String toString() {
        return "--Reservation--" +
                "\nid=" + id +
                "\nname=" + name +
                "\nsurname=" + surname +
                "\nstartDate=" + startDate +
                "\nduration=" + duration +
                "\ncost=" + cost +
                "\npersons=" + persons;
    }

    public void addPerson(Person p) {
        persons.add(p);
    }
}