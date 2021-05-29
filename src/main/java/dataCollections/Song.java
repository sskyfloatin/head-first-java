package dataCollections;

import java.util.Comparator;

public class Song implements Comparable<Song>{

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    Song(String t, String a, String r, String b) {
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return this.title + ": " +  this.artist;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    static class ArtistComparator implements Comparator<Song> {
        @Override
        public int compare(Song s1, Song s2) {
            return s1.getArtist().compareToIgnoreCase(s2.getArtist());
        }
    }
}
