package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 50;
    private final List<Media> itemsOrdered = new ArrayList<>();
    private int qtyOrdered;
    public void addMedia(Media media){
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is already full, please remove some items before adding this one.");
            return;
        }
        itemsOrdered.add(media);
        System.out.println("The disc has been added");
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }
    }
    public void addMedia(Media... mediaList){
        if (itemsOrdered.size() + mediaList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full, please remove some items before adding this one.");
            return;
        }
        for (Media media : mediaList) {
            addMedia(media);
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("The disc has been removed");
        }
        System.out.println("Cannot find the item.");
    }

    public float totalCost(){
        float cost = 0;
        for (Media item : itemsOrdered) {
            if (item != null)
                cost += item.getCost();
        }
        return cost;
    }
    public Boolean searchMedia(int id){
        for (Media media: itemsOrdered){
            if (media.getId() == id) {
                System.out.println("Found DVD: ");
                System.out.println(media);
                return true;
            }
        }
        System.out.println("Not found DVD.");
        return false;
    }
    public Boolean searchMedia(String title){
        for (Media media: itemsOrdered){
            if (title.equals(media.getTitle())) {
                System.out.println("Found DVD: ");
                System.out.println(media);
                return true;
            }
        }
        System.out.println("Not found DVD.");
        return false;
    }
    @Override
    public String toString() {
        String cartString = "";
        String cartHeader = "***********************CART***********************\n";
        String cartTitle = "Ordered Items: \n";
        cartString += cartHeader;
        cartString += cartTitle;
        for (int i = 0; i < qtyOrdered; ++i) {
            String itemString = String.format("%d. %s",
                    i + 1,
                    itemsOrdered[i]);
            cartString += itemString;
        }
        String totalCostString = String.format("Total Cost: %f\n", totalCost());
        String cartFooter = "**************************************************\n";
        cartString += totalCostString;
        cartString += cartFooter;
        return cartString;
    }
}

