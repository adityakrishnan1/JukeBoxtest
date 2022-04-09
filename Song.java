import java.util.Scanner;

public class Song {

   private String songName;
   private double songDuration;
   private int numberOfUpVotes;
   private String title;

   static {
        scannerForDatabase("SongList.txt");
    }

   public Song(String title){
       this.title = title;


   }

    public static Scanner scannerForDatabase(String databaseText) {
        File file = new File(databaseText);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("No File Found");
        }
        if (sc==null) {
            return null;
        } else {
            return sc; }
    }


    public void addNames(Scanner sc) {
        while (sc.hasNextLine()) {
            names.add(sc.nextLine());
        }
    }


}
