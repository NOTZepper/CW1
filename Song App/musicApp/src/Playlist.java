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

    /***
     * Returns the play count of the song at the given index
     * @param index
     * @return
     */
    public int getPlaycount(int index) {
        return playlist.get(index).getPlaycount(); 
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }

    /***
    * Returns all songs with play count higher than the given play count
    * @param minPlayCount
    * @return
    */
    public ArrayList<Song> getSongsByPlaycount(int minPlayCount) {
        ArrayList<Song> clone = (ArrayList<Song>) playlist.clone();
        clone.removeIf(song -> song.getPlaycount() < minPlayCount);
        return clone;
    }
    
}
