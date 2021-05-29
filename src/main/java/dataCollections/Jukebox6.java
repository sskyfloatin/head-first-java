package dataCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox6 {

    ArrayList<Song6> songList = new ArrayList<Song6>();

    public static void main(String[] args) {
            new Jukebox6().getSongs();
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

        HashSet<Song6> songSet = new HashSet<Song6>();
        songSet.addAll(songList);
        System.out.println("Song hashSet " + songSet);
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song6 nextSong = new Song6(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}