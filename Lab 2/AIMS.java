public class AIMS{
    public static void main(String[] args) {
        Cart order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        order.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        System.out.println(order);
        order.removeDigitalVideoDisc(dvd3);

        System.out.println(order);
    }
}