package com.example.viikko11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Storage {

    private ArrayList<Item> items = new ArrayList<>();
    private static Storage storage = null;

    private Storage() {}

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public void addItem(Item item)    {
        items.add(item);
    }

    public void removeItem(int index)  {
        items.remove(index);
    }

    /*public void setItem(int index, Item item)   {
        items.set(index, item);
    }*/

    public void editItemDetails(int index, String details)  {
       items.get(index).setDetails(details);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void sortAlphabet()  {
        Collections.sort(items, Comparator.comparing(Item::getDetails).thenComparing(Item::getDate));
    }

    public void sortRecent()  {
        Collections.sort(items, Comparator.comparing(Item::getDate).thenComparing(Item::getDetails));
    }
}
