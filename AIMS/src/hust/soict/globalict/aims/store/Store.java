package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static final int MAX_NUMBERS_ITEMS = 1000;
    private final List<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }
    public Boolean searchMedia(int id){
        for (Media media: itemsInStore){
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
        for (Media media: itemsInStore){
            if (title.equals(media.getTitle())) {
                System.out.println("Found DVD: ");
                System.out.println(media);
                return true;
            }
        }
        System.out.println("Not found DVD.");
        return false;
    }
    public Media getMedia(String title){
        for (Media media: itemsInStore){
            if (title.equals(media.getTitle())) {
                return media;
            }
        }
        return null;
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

    public ArrayList<Media> getItemsInStore() {
        return (ArrayList<Media>) itemsInStore;
    }
}