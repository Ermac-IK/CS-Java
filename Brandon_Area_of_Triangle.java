package brandon_area_of_triangle;

import java.util.Scanner;

        
public class Brandon_Area_of_Triangle {

    
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        double length1;
        double length2;
        double length3;
        
        length1 = k.nextDouble();
        length2 = k.nextDouble();
        length3 = k.nextDouble();
        
        double halfPerimeter = (length1 + length2 + length3) / 2;
        double area = halfPerimeter * (halfPerimeter - length1) * (halfPerimeter - length2) * (halfPerimeter - length3);
        
        area = Math.sqrt(area);
        System.out.printf("The area of the triangle is: %.2f\n", area);
               
    }
    
}
