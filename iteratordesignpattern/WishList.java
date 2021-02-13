package iteratordesignpattern;

/**
 * Class for wish list
 * @author Jackson Carroll
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * WishList Parameterized Constructor 
     * @param name A String for the name 
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[5];
    }

    /**
     * Add item method to add an item
     * @param title A String for the item title
     * @param description A String for the item description
     * @param price A souble for the item price
     */
    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if(count >= 5) {
            this.items = growArray(items);
            items[count] = item;
            count += 1;
        }
        else {
            items[count] = item;
            count += 1;
        }
    }

    /**
     * Creates a new WishListIterator
     * @return a new WishListIterator with given items
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * Gets the total cost of the WishList
     * @return the total cost of the WishList
     */
    public double getTotalCost() {
        double total = 0;
        int count2 = 0;
        while(items[count2] != null) {
            total += items[count2].getPrice();
            count2++;
        }
        return total;
    }

    /**
     * Grow array method to double the size of the array
     * @param items An array of items type Item
     * @return an array twice the size with the same data
     */
    private Item[] growArray(Item[] items) {
        Item[] temp = new Item[items.length * 2];

        for(int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
}
