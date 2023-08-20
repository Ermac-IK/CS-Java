package brandon_convert_int;

import java.util.Scanner;

public class Brandon_Convert_Int {
    
    public static int convert(double nonInteger) {
        int num = (int)nonInteger;
        if ((nonInteger - num) > .5) {
            num = num + 1;
        }
        return num;
    }

    
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in); 
        double number;
        System.out.println("Enter in a number: ");
        number = k.nextDouble(); 
        System.out.println(convert(number));
        System.out.println("Enter in a number: ");
        number = k.nextDouble(); 
        System.out.println(convert(number));
    }
    
}
