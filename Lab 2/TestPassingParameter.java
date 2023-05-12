public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        

    }
    // public static void swap(Object o1, Object o2){
    //     Object tmp = o1;
    //     o1 = o2;
    //     o2 = tmp;
    // }
    public static void swap(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        //This function only apply to DigitalVideoDisc
        String tmpTitle = disc1.getTitle();
        disc1.setTitle(disc2.getTitle());
        disc2.setTitle(tmpTitle);

        String tmpCategory = disc1.getCategory();
        disc1.setCategory(disc2.getCategory());
        disc2.setCategory(tmpCategory);

        String tmpDirector = disc1.getDirector();
        disc1.setDirector(disc2.getDirector());
        disc2.setDirector(tmpDirector);

        int tmpLength = disc1.getLength();
        disc1.setLength(disc2.getLength());
        disc2.setLength(tmpLength);

        float tmpCost = disc1.getCost();
        disc1.setCost(disc2.getCost());
        disc2.setCost(tmpCost);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}