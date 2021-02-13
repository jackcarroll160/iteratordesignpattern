package iteratordesignpattern;

/**
 * Item class extending WishList
 * @author Jackson Carroll
 */
public class Item {
    private String title;
    private String description;
    private double price;

    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "***** "+ this.title + " *****\n" + this.description + "\nPrice: $" + this.price;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("\n" + toString());
    }
}
