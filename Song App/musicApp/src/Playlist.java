import java.util.*;
import java.io.*;

public class Playlist implements Serializable {
    private ArrayList<Song> playlist;

    //Setting up the playlist as an arraylist containing the song title, artis and play count
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

    
    //Returns the play count of the song at the given index
    public int getPlaycount(int index) {
        return playlist.get(index).getPlaycount(); 
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }

   
    //Returns all songs with play counts higher than the given play count
    
    public ArrayList<Song> getSongsByPlaycount(int minPlayCount) {
        ArrayList<Song> clone = (ArrayList<Song>) playlist.clone();
        clone.removeIf(song -> song.getPlaycount() < minPlayCount);
        return clone;
    }
}
