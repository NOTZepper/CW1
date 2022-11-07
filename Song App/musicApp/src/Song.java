import java.io.*;

public class Song implements Serializable
{
	private String title;
	private String artist;
	private int playcount;

    // creating the Song with the variables: title, artist and playcount. Play count will be stored as an integer.
    public Song(String title, String artist, int playcount) {
        this.title = title;
        this.artist = artist;
        this.playcount = playcount;
    }

    //setting the song title as a string
    public void setTitle(String title) {
		this.title = title;
	}

    //returning the song title as a string
    public String getTitle() {
        return this.title;
    }

    //setting the song artist as a string
    public void setArtist(String artist) {
        this.artist = artist;
    }

    //returning the song artist as a string
    public String getArtist() {
        return this.artist;
    }

    //setting the plau count as an integer
    public void setPlaycount(int playcount) throws InvalidPlaycountException {
        if(playcount > 0)
        {
            this.playcount = playcount;
        }
    }

    //returning the play count as an integer
    public int getPlaycount() {
        return this.playcount;
        
    }
}
