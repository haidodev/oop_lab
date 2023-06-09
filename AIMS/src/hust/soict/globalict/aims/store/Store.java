package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static final int MAX_NUMBERS_ITEMS = 1000;
    private List<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The disc has been added");
    }

    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("The disc has been removed");
        }
        System.out.println("Cannot find the item.");
    }

    @Override
    public String toString() {
        String cartString = "";
        String cartHeader = "***********************STORE**********************\n";
        String cartTitle = "All Items: \n";
        cartString += cartHeader;
        cartString += cartTitle;
        int itemCnt = 1;
        for (Media media : itemsInStore){
            String itemString = String.format("%d. %s",
                    itemCnt,
                    media);
            cartString += itemString;
            ++itemCnt;
        }
        String cartFooter = "**************************************************\n";
        cartString += cartFooter;
        return cartString;
    }

}