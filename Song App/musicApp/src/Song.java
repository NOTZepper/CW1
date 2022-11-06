import java.io.*;

public class Song implements Serializable
{
	private String title;
	private String artist;
	private String playcount;

    public Song(String title, String artist, String playcount) {
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

    public void setPlaycount(String string) {
        this.playcount = string;
    }

    public String getPlaycount() {
        return this.playcount;
        
    }


}
