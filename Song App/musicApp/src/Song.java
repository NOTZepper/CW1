import java.io.*;

public class Song implements Serializable
{
	private String title;
	private String artist;
	private int playcount;

    public Song(String title, String artist, int playcount) {
        this.title = title;
        this.artist = artist;
        this.playcount = playcount;
    }

    public void setTitle(String title) {
		this.title = title;
	}

    public String getTitle() {
        return this.title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    public int getPlaycount() {
        return this.playcount;
    }
}
