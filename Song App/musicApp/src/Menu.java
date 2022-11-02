import java.io.*;
import java.security.InvalidKeyException;
import java.util.Scanner;

public class Menu {
    
    private Scanner scan = new Scanner(System.in);
    private Playlist playlist = new Playlist();


    
    public int showMenu() {
        int input; 

        System.out.print("\nWhat would you like to do?"     //"\n" = new line/next line
                        + "\n1. Add a Song to the Playlist" + "\n2. Remove a Song from the Playlist"
                        + "\n3. View Playlist" + "\n4. View Playlist by number of play count" + "\nSelection");
        input = scan.nextInt();
        System.out.print("\n");

        return input; //returns the input
    }

    public void runMenu() {
       int input = showMenu();
        switch (input) {
            case 1:
			addSong();
			savePlaylist();
			runMenu();
			break;

            case 2:
            removeSong();
            savePlaylist();
            runMenu();
            break;
            
            case 3:
            viewPlaylist();
            runMenu();
            break;

            default:
			System.out.println("\nThat is not a valid selection!\n");
			runMenu();
        }
    }

    //Song creation
    public void addSong()
	{
		Song newSong = new Song(null, null, 0);
		
		
        newSong.setTitle(scan.nextLine());                  // Sets title 
		System.out.print("Enter title: ");              //Asking for a title input
		newSong.setArtist(scan.nextLine());                 //sets artist
		System.out.print("Enter artist: ");     
	    newSong.setPlaycount(scan.nextLine());

        do {
            try{
                System.out.print("Enter play count: ");
                newSong.setPlaycount(scan.next());
            }
            catch (InvalidKeyException invalidPlaycount) {
                System.out.print(invalidPlaycount.toString());
                System.out.print("Enter Playcount as numbers \n");
            }
        }while (newSong.getPlaycount() = null);

        playlist.addSong(newSong);                          // saves song to playlist
    }


    public void viewPlaylist() {

        for(int i = 0; i < playlist.getPlaylistSize(); i++)     //"PlaylistSize" = number of songs in the playlist
			{
				System.out.print("\n#" + (i+1) + " ");          // new line starts with "#" for number followed by the number of the song (call it "song id" if you want)
				System.out.print("\""+ playlist.getTitle(i) + "\"");     
				System.out.print("-" +playlist.getArtist(i)+ "" + ", ");
				System.out.print(playlist.getPlaycount(i));
			}
			System.out.print("\n");
    }


    public void removeSong() {

        viewPlaylist();
        boolean flag = false;
        do {
            System.out.print("\nSelect a song to remove: ");
            int removeSong = scan.nextInt();

            if(removeSong < playlist.getPlaylistSize() || removeSong > playlist.getPlaylistSize())
            {
                System.out.print("That is not a valid Selection");
            }
            else{
                playlist.removeSong(--removeSong);
                flag = true;
            }
        } while(flag == false );
    }

    public void loadPlaylist()
	{
		try
		{
			FileInputStream fileInputStream = new FileInputStream("playlist");
			
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				
			playlist = (Playlist)objectInputStream.readObject();
				
			objectInputStream.close();
		}
		catch(FileNotFoundException fnfException)
		{
			System.out.println("No File");
		}
		catch(IOException ioException)
		{	
			System.out.println("IO no good");
		}
			
		catch(ClassNotFoundException cnfException)
		{	
			System.out.println("This is not a Playlist.");
		}
		
	}


    public void savePlaylist()
	{
		try
		{
			FileOutputStream fileOutputStream = new FileOutputStream("playlist");
			
			ObjectOutputStream outObjectStream = new ObjectOutputStream(fileOutputStream);
			
			outObjectStream.writeObject(playlist);
			
			outObjectStream.flush();
			outObjectStream.close();
		}
		catch(FileNotFoundException fnfException)
		{
			System.out.println("No file");
		}
		catch(IOException ioException)
		{	
			System.out.println("bad IO");
		}

	}


}
