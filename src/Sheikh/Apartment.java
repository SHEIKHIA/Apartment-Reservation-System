package Sheikh;
/**
 * Represents an apartment with essential information such as address, capacity, and price.
 * @author sheikhishtiakahmed
 * @version 1st May 2020
 */
public class Apartment {
    // Unique identifier for the apartment
    private int id;

    // The physical address of the apartment
    private String address;

    // Maximum number of persons the apartment can accommodate
    private int capacity;

    // Price per day for renting the apartment
    private double price;

    /**
     * Constructor to initialize the Apartment object with provided values.
     *
     * @param id       Unique identifier for the apartment.
     * @param address  The physical address of the apartment.
     * @param capacity Maximum number of persons the apartment can accommodate.
     * @param price    Price per day for renting the apartment.
     */
    public Apartment(int id, String address, int capacity, double price) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.price = price;
    }

    /**
     * Returns a string representation of the Apartment object.
     *
     * @return String representation of the apartment, including its id, address, capacity, and price.
     */
    @Override
    public String toString() {
        return "--Apartment--" +
                "\nid = " + id +
                "\naddress = " + address +
                "\ncapacity = " + capacity +
                "\nprice = " + price;
    }

    /**
     * Retrieves the price per day for renting the apartment.
     *
     * @return The price per day for renting the apartment.
     */
    public double getPrice() {
        return price;
    }
}
