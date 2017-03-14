import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    List<CD> allCDs = new ArrayList<CD>();

    allCDs.add(new CD("Metallica", "Black Album", 1991, 10));
    allCDs.add(new CD("Between the Buried and Me", "Colors", 2007, 12));
    allCDs.add(new CD("Radiohead", "OK Computer", 1997, 12));


    System.out.println("Welcome to the cd store.");



    boolean programRunning = true;

    while(programRunning) {
      System.out.println("What do you want to do?");
      System.out.println("For searching years, type 'year'. For artist, type 'artist'. For album, type 'album'. To search by price, type 'price'. To see all CDs, type 'all'. To enter a coupon code, enter 'coupon'. To add a CD to inventory, type 'add'. To exit, type 'exit' and then bang your head on the keyboard nine times.");
      String userChoice = myConsole.readLine();

      if (userChoice.equals("all")) {
        for (CD thisCD : allCDs) {
          System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice);
        }
      } else if (userChoice.equals("year")) {
        System.out.println("Which year would you like to search for?");
        int userInput = Integer.parseInt(myConsole.readLine());

        for (CD thisCD : allCDs) {
          if (thisCD.mReleaseYear == userInput) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice);
          }
        }
      } else if (userChoice.equals("artist")) {
        System.out.println("Which artist would you like to search for?");
        String userInput = myConsole.readLine();

        for (CD thisCD : allCDs) {
          if (thisCD.mArtist.equals(userInput)) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice);
          }
        }
      } else if (userChoice.equals("album")) {
        System.out.println("Which album would you like to search for?");
        String userInput = myConsole.readLine();

        for (CD thisCD : allCDs) {
          if (thisCD.mAlbum.equals(userInput)) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice);
          }
        }
      } else if (userChoice.equals("price")) {
        System.out.println("Which price would you like to search for?");
        int userInput = Integer.parseInt(myConsole.readLine());

        for (CD thisCD : allCDs) {
          if (thisCD.mPrice == userInput) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice);
          }
        }
      } else if (userChoice.equals("exit")) {
        programRunning = false;
      } else if (userChoice.equals("add")) {
        System.out.println("Enter artist name.");
        String userArtist = myConsole.readLine();
        System.out.println("Enter album name.");
        String userAlbum = myConsole.readLine();
        System.out.println("What year did it come out?");
        int userYear = Integer.parseInt(myConsole.readLine());
        System.out.println("Let's make money. How much?");
        int userPrice = Integer.parseInt(myConsole.readLine());

        CD userCD = new CD(userArtist, userAlbum, userYear, userPrice);
        allCDs.add(userCD);

        System.out.println("You put in:");
        System.out.println(userCD.mArtist + " - " + userCD.mAlbum + " - " + userCD.mReleaseYear + " :  $" + userCD.mPrice);


      } else if (userChoice.equals("coupon")) {
        System.out.println("Enter your coupon code: ");
        String userInput = myConsole.readLine();

        if (userInput.equals("10percent")) {
          for (CD thisCD : allCDs) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice*.9);
          }
        } else if (userInput.equals("20percent")) {
          for (CD thisCD : allCDs) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice*.8);
          }
        } else if (userInput.equals("30percent")) {
          for (CD thisCD : allCDs) {
            System.out.println(thisCD.mArtist + " - " + thisCD.mAlbum + " - " + thisCD.mReleaseYear + " :  $" + thisCD.mPrice*.7);
          }
        } else {
          System.out.println("NOT A COUPON");
        }
      } else {
        System.out.println("Try again.");
      }
    }
  }
}
