
public class Store {
    
    public static final int MAX_NUMBERS_ITEMS = 1000;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
    private int qtyInStore;

    public void addDVD(DigitalVideoDisc disc) {
        itemsInStore[qtyInStore] = disc;
        ++qtyInStore;
        System.out.println("The disc has been added");
    }

    public void addDVD(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDVD(dvd);
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; ++i) {
            if (itemsInStore[i] == disc) {
                --qtyInStore;
                System.out.println("The disc has been removed");
                for (int j = i + 1; j < qtyInStore; ++j) {
                    itemsInStore[j - 1] = itemsInStore[j];
                }
                itemsInStore[qtyInStore] = null;
                return;
            }
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
        for (int i = 0; i < qtyInStore; ++i) {
            String itemString = String.format("%d. %s", 
                i + 1, 
                itemsInStore[i]);
            cartString += itemString;
        }
        String cartFooter = "**************************************************\n";
        cartString += cartFooter;
        return cartString;
    }

}