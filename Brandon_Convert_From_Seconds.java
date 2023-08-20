package brandon_convert_from_seconds;

import java.util.Scanner;

public class Brandon_Convert_From_Seconds {

    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        int seconds;
        int minutes;
        int hours;
        
        System.out.println("Enter in total number of seconds: ");
        int totalSeconds = k.nextInt();
        
        hours = totalSeconds / 60 / 60;
        minutes = totalSeconds / 60 % 60;
        seconds = totalSeconds % 60;
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
    
}
