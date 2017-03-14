import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CD loveSymbolAlbum = new CD("Prince", "Love Symbol Album", 1992, 16.40);
    CD purpleRain = new CD("Prince", "Purple Rain", 1984, 7.89);

    List<CD> allCDs = new ArrayList<CD>();
    allCDs.add(loveSymbolAlbum);
    allCDs.add(purpleRain);
    String navigationChoice = "";

    while(!navigationChoice.equals("Exit")){
      System.out.println("Welcome to our CD store. What would you like to do? List Catalog, Add CD, Exit");
      navigationChoice = myConsole.readLine();
      if (navigationChoice.equals("List Catalog")) {
        for ( CD individualCD : allCDs) {
          System.out.println( "---------------------" );
          System.out.println( individualCD.mArtistName );
          System.out.println( individualCD.mAlbumName );
          System.out.println( individualCD.mReleaseYear );
          System.out.println( individualCD.mPrice );
        }
      } else if (navigationChoice.equals("Add CD")) {
        System.out.println("Alright, what is the name of the artist?");
        String userArtistName = myConsole.readLine();
        System.out.println("Alright, what is the name of the album?");
        String userAlbumName = myConsole.readLine();
        System.out.println("Alright, what year was the album released?");
        int userReleaseYear = Integer.parseInt(myConsole.readLine());
        System.out.println("Alright, what does the album cost?");
        double userPrice = Double.parseDouble(myConsole.readLine());
        CD userCD = new CD(userArtistName, userAlbumName, userReleaseYear, userPrice);
        allCDs.add(userCD);
        System.out.println("Alright, here's your new CD:");
        System.out.println( "---------------------" );
        System.out.println( userCD.mArtistName );
        System.out.println( userCD.mAlbumName );
        System.out.println( userCD.mReleaseYear );
        System.out.println( userCD.mPrice );
      }
    }
  }
}
