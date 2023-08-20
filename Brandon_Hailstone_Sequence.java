package brandon_hailstone_sequence;

import java.util.Scanner;

public class Brandon_Hailstone_Sequence {

   
    public static void main(String[] args) {
        //  program that reads an integer as input and prints the hailstone 
        // sequence starting with the integer entered. Format the output so that 
        // ten integers, each separated by a tab character (\t), are printed per line.
        Scanner k = new Scanner(System.in);
        
        int n;
        n = k.nextInt();
        int tabs = 2;
        int sequence = 2;
        
        if (n != 1) {
            System.out.print(n + "\t");
            if (n % 2 == 0) {
                sequence = n/2;
                System.out.print(sequence + "\t");
            }
            else {
                sequence = (3 * n) + 1;
                System.out.print(sequence + "\t");
            }
        }
        
        while (sequence != 2) {
         if (sequence % 2 == 0) {
            sequence = sequence / 2;
            System.out.print(sequence + "\t");
            tabs = tabs + 1;
         }
         else if (sequence % 2 == 1) {
            sequence = (3 * sequence) + 1;
            System.out.print(sequence + "\t");
            tabs = tabs + 1;
         }
      if (tabs % 10 == 0) {
         System.out.println(); 
      }
      
      } 
      
      System.out.println("1");   
    }
    
}
