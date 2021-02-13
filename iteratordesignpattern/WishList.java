package iteratordesignpattern;

/**
 * Wish List class extending WishListIterator
 * @author Jackson Carroll
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * WishList Parameterized Constructor 
     * @param name A String  
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[5];
    }

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

    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    public double getTotalCost() {
        double total = 0;
        int count2 = 0;
        while(items[count2] != null) {
            total += items[count2].getPrice();
            count2++;
        }
        return total;
    }

    private Item[] growArray(Item[] items) {
        Item[] temp = new Item[items.length * 2];

        for(int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
}
