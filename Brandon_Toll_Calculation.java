package brandon_toll_calculation;

import java.util.Scanner;

public class Brandon_Toll_Calculation {
    
    public static double calcToll(int hour, boolean isMorning, boolean isWeekend) {
        double cost = 0;
        if (isWeekend == true) {
            if (isMorning == true) {
                if (hour < 7) {
                    cost = 1.05;
                }
                else {
                    cost = 2.15;
                }
            }
            else if (isMorning == false) {
                if (hour >= 8) {
                    cost = 1.10;
                }
                else {
                    cost = 2.15;
                }
            }
        }
        else if (isWeekend == false) {
            if (isMorning == true) {
                if (hour < 7) {
                    cost = 1.15;
                }
                else if ((hour >= 7) && (hour < 10)) {
                    cost = 2.95;
                }
                else if (hour >= 10) {
                    cost = 1.90;
                }
            }
            else if (isMorning == false) {
                if (hour < 3) {
                    cost = 1.90;
                }
                else if ((hour > 3) && (hour < 8)) {
                    cost = 3.95;
                }
                else if (hour >= 8) {
                    cost = 1.40;
                    }
            }
        }
        return cost; 
    }

    public static void main(String[] args) {
        System.out.println(calcToll(6, true, false));
        System.out.println(calcToll(7, true, false));
        System.out.println(calcToll(11, true, false));
        System.out.println(calcToll(5, false, false));
        System.out.println(calcToll(11, false, false));
    }
    
}
