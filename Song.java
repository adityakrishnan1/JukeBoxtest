
import android.util.Log;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Song {
    private String title;
    private static ArrayList<String> songs;

    public static void main(String[] args) throws FileNotFoundException{
        creatingNewDatabase();
    }
    public Song(String title) {
        this.title= title;
    }

    public static void creatingNewDatabase() throws FileNotFoundException{
        File text = new File("/Users/adityakrishnan/Documents/Songlist.txt");
        Path path= Paths.get("Songlist.txt");
        //Creating Scanner instance to read File in Java
        Iterator<String> scnr = new Scanner(text);

        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNext()){
            String line = scnr.next();
            Log.v("line",line);
            lineNumber++;
        }
    }
}
