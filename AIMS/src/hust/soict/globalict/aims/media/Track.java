package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

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
    public void play() throws PlayerException {
        if (length < 0){
            throw new PlayerException("ERROR: Track length is non-negative!");
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
