package methods_practice;

import java.util.Scanner; 

public class Methods_Practice {

    public static double NewtonMethod(double x1, int trial) {
        double function = Math.pow(x1, 8) - 500; 
        double derivative = 8 * Math.pow(x1, 7); 
        double newtonMethod = x1 - (function / derivative); 
        
        System.out.println("x" + trial + " = " + x1 + " - " + function + " / " + derivative + " = " + newtonMethod);
        return newtonMethod; 
    }
   
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); 
        int trial = 1; 
        double x = 3;
        double function = Math.pow(x, 8) - 500; 
        double derivative = 8 * Math.pow(x, 7); 
        double x1 = x - (function / derivative); 
        
        System.out.println("x" + trial + " = " + x + " - " + function + " / " + derivative + " = " + x1);
        trial += 1; 
        double newtonMethod = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod; 
        trial += 1; 
        double newtonMethod2 = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod2; 
        trial += 1; 
        double newtonMethod3 = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod3; 
        trial += 1; 
        double newtonMethod4 = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod4; 
        trial += 1; 
        double newtonMethod5 = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod5; 
        trial += 1; 
        double newtonMethod6 = (NewtonMethod(x1, trial)); 
        x1 = newtonMethod6; 
        trial += 1; 
        double newtonMethod7 = (NewtonMethod(x1, trial)); 
    }
    
}
