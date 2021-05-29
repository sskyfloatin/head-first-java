package dataCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Jukebox8 {

    ArrayList<Song6> songList = new ArrayList<>();
    int val;

    public static void main(String[] args) {
        new Jukebox8().go();
    }

    public void go() {
        getSongs();
        System.out.println("Unsorted list " + songList);
        Collections.sort(songList);
        System.out.println("Sorted list is " + songList);
        TreeSet<Song6> songSet = new TreeSet<>();
        songSet.addAll(songList);
        System.out.println("TreeSet list is " + songSet);
    }

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {ex.printStackTrace();}
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song6 nextSong = new Song6(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}
