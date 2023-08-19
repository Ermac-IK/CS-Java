package playerroster;

import java.util.Scanner; 

public class PlayerRoster {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
      int [] jerseyValues = new int [6];
      int [] ratingValues = new int [6];
      char chooseOption;
      int above;
      int i;
      int jersey;
      for (i = 1; i <= 5; ++i) {
         System.out.println("Enter player " + i + "'s jersey number:");
         jerseyValues[i] = k.nextInt(); 
         System.out.println("Enter player " + i + "'s rating:");
         ratingValues[i] = k.nextInt();
         System.out.println(); 
      }
      System.out.println("ROSTER");
      for (i = 1; i <= 5; ++i) {
         System.out.println("Player " + i + " -- Jersey number: " + jerseyValues[i] + ", Rating: " + ratingValues[i]); 
      }
      int opt = 1;
      do {
      System.out.println(); 
         System.out.println("MENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
         System.out.println();
         System.out.println("Choose an option:");
         chooseOption = k.next().charAt(0); 
          
            if (chooseOption == 'u') { 
               System.out.println("Enter a jersey number:");
               jersey = k.nextInt();
               for (i = 1; i <= 5; ++i) {
                  if (jerseyValues[i] == jersey) {
                     System.out.println("Enter a new rating for player:");
                     ratingValues[i] = k.nextInt(); 
                  }
               }
            }
            if (chooseOption == 'a') { 
               System.out.println("Enter a rating: ");
               above = k.nextInt();
               System.out.println("ABOVE " + above);
               for (i = 1; i <= 5; ++i) {
                  if (ratingValues[i] > above) {
                  System.out.println("Player " + i + " -- Jersey number: " + jerseyValues[i] + ", Rating: " + ratingValues[i]);
                  }
               }
            }
            if (chooseOption == 'r') {
            System.out.println("Enter a jersey number: ");
            jersey = k.nextInt();
               for (i = 1; i <= 5; ++i) {
                  if (jerseyValues[i] == jersey) {
                     System.out.println("Enter a new jersety number:");
                     jerseyValues[i] = k.nextInt();
                     System.out.println("Enter a rating for new player:");
                     ratingValues[i] = k.nextInt();
                     }
               }
            }   
            if (chooseOption == 'o') { 
               System.out.println("ROSTER");
                  for (i = 1; i <= 5; ++i) {
                  System.out.println("Player " + i + " -- Jersey number: " + jerseyValues[i] + ", Rating: " + ratingValues[i]);
                  }
            }
            if (chooseOption == 'q') {
               opt = 0;
               break;
            }
      } while (opt != 0);
   }
}
