package hust.soict.globalict.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public void play(){
        if (length < 0){
            System.out.println("Track " + title + " cannot be played");
            return;
        }
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());

    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Track track)){
            return false;
        }
        return length == track.getLength() && title.equals(track.getTitle());
    }
}
