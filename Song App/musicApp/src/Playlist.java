import java.util.*;
import java.io.*;

public class Playlist implements Serializable {
    private ArrayList<Song> playlist;

    public Playlist() {
        playlist = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public int getPlaylistSize() {
        return playlist.size();
    }

    public String getTitle(int index) {
		return playlist.get(index).getTitle();
	}

    public String getArtist(int index) {
        return playlist.get(index).getArtist();
    }

    public String getPlaycount(int index) {
        return playlist.get(index).getPlaycount();
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }
    
}
