package boolean_practice;

import java.util.Scanner;

public class Boolean_Practice 
{

    
    public static void main(String[] args) 
    {
        Scanner k = new Scanner (System.in);
        
        double grossIncome;
        
        System.out.println("What is your income: ");
        grossIncome = k.nextDouble();
        
            if (grossIncome >= 0 && grossIncome <= 20000)
            {
                double incomeTax = 0; 
                double income = grossIncome - incomeTax; 
                System.out.println("Your income is $" + income);
                System.out.println("Income tax: $" + incomeTax);
            }
            else if (grossIncome >= 20001 && grossIncome <= 62000)
            {
                double incomeTax = ((grossIncome - 20000) * .15); 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
            else if (grossIncome >= 62001 && grossIncome <= 118000)
            {
                double incomeTax = ((grossIncome - 62000) * .25) + 6300; 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
            else if (grossIncome >= 118001 && grossIncome <= 252000)
            {
                double incomeTax = ((grossIncome - 118000) * .32) + 20300; 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
            else if (grossIncome >= 252000 && grossIncome <= 438000)
            {
                double incomeTax = ((grossIncome - 252000) * .40) + 63180; 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
            else if (grossIncome >= 438001 && grossIncome <= 980000)
            {
                double incomeTax = ((grossIncome - 438000) * .50) + 137580; 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
            else if (grossIncome >= 980001)
            {
                double incomeTax = ((grossIncome - 980000) * .60) + 408580; 
                double income = grossIncome - incomeTax;
                System.out.println("Your income after tax is $" + income);
                System.out.println("Income tax: $" + incomeTax);         
            }
        
        
    }
    
    
}
    

