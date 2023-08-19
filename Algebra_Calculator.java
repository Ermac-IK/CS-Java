package algebra_calculator;
import java.util.Scanner;
// Program solves for x and y values
public class Algebra_Calculator {

   
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    int x;
    int y;
    int num1, num2;
    int num3, num4;
    int answer1, answer2;
    int solution1, solution2;
    System.out.println("Problem 1 -");
    System.out.println("Enter in first value: ");
    num1 = k.nextInt();
    System.out.println("Enter in second value: ");
    num2 = k.nextInt();
    System.out.println("Enter in solution for first problem.");
    solution1 = k.nextInt();
    
    System.out.println();
    System.out.println("Problem 2 -");
    System.out.println("Enter in first value: ");
    num3 = k.nextInt();
    System.out.println("Enter in second value: ");
    num4 = k.nextInt();
    System.out.println("Enter in solution for second problem.");
    solution2 = k.nextInt();
    System.out.println();
    boolean solution = false;
      
    for (x = -10; x <= 10; ++x) {
        for (y = -10; y <= 10; ++y) {
        answer1 = (num1 * x) + (num2 * y);
        answer2 = (num3 * x) + (num4 * y);
            if ((answer1 == solution1) && (answer2 == solution2)) {
            System.out.println(num1 + "x" + " + " + num2 + "y" + " = " + solution1);
            System.out.println("x = " + x + " y = " + y);
            System.out.println(num3 + "x" + " + " + num4 + "y" + " = " + solution2);
            System.out.println("x = " + x + " y = " + y);
            solution = true; 
            }
        }
    }
    if (solution == false) {
         System.out.println("There is no solution");     
    }
        
    
        
    
    
        
    }
    
}
