package element_in_a_range;
import java.util.Scanner;
public class Element_In_A_Range {

    public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      
      System.out.println("How many numbers would you like to input? ");
      int countVal = k.nextInt();
      int[] userVals = new int[countVal];
      System.out.println("Enter in list of numbers: ");
        for (int i = 0; i < userVals.length; ++i) {
            userVals[i] = k.nextInt();
        }
        int low;
        System.out.print("Enter in range - from low ");
        low = k.nextInt();
        System.out.print(" to high "); 
        int high = k.nextInt();
        
        for (int i = 0; i < userVals. length; ++i) {
            if ((userVals[i] >= low) && (userVals[i] <= high)) {
                System.out.print(userVals[i] + ",");
            }
        }
      System.out.println(); 
    }
    
}
