package main.com.adventure.player;

import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {
    //added the string
    String backpack;

    private static final int MAX_CAPACITY = 5;

    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Add an item to the end of the backpack array and only if there's enough room in the backpack.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {
        //TODO Complete the function
        for (int i= 0; i < MAX_CAPACITY; i++){
            if(items[i]== null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        Tangible item;
        int i;
        for (i = 0; i < items.length; i++){
            if (items[i]!= null && items[i].getName().equals(name)){
                return items[i] ;
            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack and removes it if it is.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        int i;
        for (i = 0; i < items.length; i++){
            if (items[i] == item) {
                items [i]= null;
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
        System.out.println("Here are the items in your backpack:");
        for (int i =0; i < MAX_CAPACITY; i++){
            if (items[i] != null){
                System.out.println(" - " + items[i].getName());
                continue;
            }

        }

    }
}
