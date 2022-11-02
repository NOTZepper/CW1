import java.io.*;
import java.util.Scanner;

public class Menu {
    
    private Scanner scan = new Scanner(System.in);
    private Playlist playlist = new Playlist();


    
    public int showMenu() {
        int input; 

        System.out.print("\nWhat would you like to do?"
                        + "\n1. Add a Song to the Playlist" + "\n2. Remove a Song from the Playlist"
                        + "\n3. View Playlist" + "\n4. View Playlist by number of play count" + "\n");
        input = scan.nextInt();
        System.out.print("\n");

        return input;
    }
}
