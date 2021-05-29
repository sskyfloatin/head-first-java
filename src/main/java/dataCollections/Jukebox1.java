package dataCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {

    ArrayList<String> songList = new ArrayList<String>();
    public static void main(String[] args) {
            new Jukebox1().getSongs();
    }

    void getSongs() {

        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String song;
            while ((song = reader.readLine()) != null) {
                addSong(song);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Before sort:\n" + songList);
        Collections.sort(songList);
        System.out.println("Sorted:\n" + songList);
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }

}