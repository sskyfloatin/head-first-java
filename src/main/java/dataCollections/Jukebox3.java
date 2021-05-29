package dataCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
            new Jukebox3().getSongs();
    }

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String song;
            while ((song = reader.readLine()) != null) {
                addSong(song);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Unsorted list is " + songList);
        Collections.sort(songList);
        System.out.println("Sorted list by name is " + songList);
        Collections.sort(songList, new Song.ArtistComparator());
        System.out.println("Sorted list by artist is " + songList);
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}