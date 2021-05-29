package dataCollections;

public class Song6 implements Comparable<Song6>{

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public boolean equals(Object aSong) {
        Song6 s = (Song6) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
    }

    Song6(String t, String a, String r, String b) {
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
        return this.title;
    }

    @Override
    public int compareTo(Song6 s) {
        return title.compareTo(s.getTitle());
    }
}
