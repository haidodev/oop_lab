package hust.soict.globalict.aims.media;


import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) throws Exception {
        super(title, category, director, length, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost) throws Exception {
        this(title, category, null, 0, cost);

    }

    public DigitalVideoDisc(String title) throws Exception {
        this(title, null, null, 0, 0f);
    }



    public DigitalVideoDisc(String title, String category, String director, float cost) throws Exception {
        this(title, category, director, 0, cost);

    }
    public void play() throws PlayerException {
        if (getLength() < 0){
            throw new PlayerException("ERROR: Track length is non-negative!");
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());

    }
    @Override
    public String toString(){
        return String.format("DVD#%d - %s - %s - %d:  %.2f$\n",
                getId(),
                getTitle(),
                getCategory(),
                getLength(),
                getCost());
    }
}

