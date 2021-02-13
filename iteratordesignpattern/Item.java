package iteratordesignpattern;

/**
 * Item class for items
 * @author Jackson Carroll
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Item constructor taking in title, description and price
     * @param title A String for the title of the item
     * @param description A String for the description of the item
     * @param price A double for the price of the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Returns a String with the title, description and price
     * @return A String of title, description and price
     */
    public String toString() {
        return "***** "+ this.title + " *****\n" + this.description + "\nPrice: $" + this.price;
    }

    /**
     * Gets the price of the item
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Prints out of the toString method
     */
    public void print() {
        System.out.println("\n" + toString());
    }
}
