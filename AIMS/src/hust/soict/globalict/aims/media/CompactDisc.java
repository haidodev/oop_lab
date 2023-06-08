package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(int id, String title, String category, String artist, float cost) {
        super(id, title, category, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track trackName){
        if (tracks.contains(trackName)){
            System.out.println("The author " + trackName.getTitle() + " is already listed.");
            return;
        }
        tracks.add(trackName);
    }
    public void removeTrack(Track trackName){
        if (tracks.contains(trackName)){
            System.out.println("Not found author " + trackName.getTitle());
            return;
        }
        tracks.add(trackName);
    }
    public int getLength(){
        int sumLen = 0;
        for (Track track : tracks){
            sumLen += track.getLength();
        }
        return sumLen;
    }
}
