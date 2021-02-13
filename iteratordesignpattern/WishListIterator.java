package iteratordesignpattern;

import java.util.NoSuchElementException;
/**
 * WishList Iterator class implementing Iterator 
 * @author Jackson Carroll
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position = 0;

    /**
     * The Wish List's iterator
     * @param items Items for the type Item
     */
    public WishListIterator(Item[] items) {
        this.items = items;
    }

    /**
     * Checking if there is an item next in WishList
     * @return true or false
     */
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Gets the next item in the WishList
     * @return the item
     */
    public Item next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Item item = items[position];
        position = position + 1;
        return item;
    }
}
