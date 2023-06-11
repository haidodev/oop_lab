package hust.soict.globalict.aims.interaction;

import java.util.Scanner;

public class CLI {
    static Scanner scanner = new Scanner(System.in);
    public static void showMenu() {

        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

    }
    public static int readInput(int lowerBound, int upperBound){

        boolean validInput = false;
        int number = 0;

        while (!validInput) {
            System.out.print("Enter the number: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                validInput = number >= lowerBound && number <= upperBound;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        System.out.println("Valid number entered: " + number);
        return number;

    }
    public static int readInput(int upperBound) {
        return readInput(0, upperBound);
    }
    public static int readInput() {
        return readInput(Integer.MAX_VALUE);
    }
    public static String readMediaName(){
        System.out.print("Enter the media title: ");
        return scanner.nextLine();

    }

        public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }
    public static void mediaDetailsMenu(boolean isDisc) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (isDisc) System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

    }
    public static void updateStoreMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add new media to store");
        System.out.println("2. Remove media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

    }
    public static void filterMediaMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias by id");
        System.out.println("2. Filter medias by title");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

    }
    public static void sortMediaMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort medias by cost then title");
        System.out.println("2. Sort medias by title then cost");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

    }
    public static void placeOrder(){
        System.out.println("An order was created.");
    }
    public static void addItem(){
        System.out.println("A media was added.");
    }
    public static void removeItem(){
        System.out.println("Item removed successfully.");
    }
}
