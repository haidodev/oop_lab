package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) throws Exception {
        super(title, category, director, length, cost);
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
            System.out.println("Not found track " + trackName.getTitle());
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

    @Override
    public void play() throws PlayerException {
        System.out.println("Playing CD: " + this.getTitle());
        for (Track track : tracks){
            track.play();
        }
        if(this.getLength() > 0) {
            Iterator<Track> iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = iter.next();
                nextTrack.play();
            }
        }else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }
    @Override
    public String toString(){
        return String.format("CD#%d - %s - %s - %s - %d:  %.2f$\n",
                getId(),
                getTitle(),
                getCategory(),
                getArtist(),
                getLength(),
                getCost());
    }
}
