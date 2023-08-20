package people.s_weights;

import java.util.Scanner;
public class PeopleS_Weights {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int numOfWeights;
        System.out.println("How many weights would you like to enter? ");
        numOfWeights = k.nextInt();
        double []userWeights = new double [numOfWeights + 1];
        double total = 0;
        double average = 0;
        
        for (int i = 1; i <= numOfWeights; ++i) {
            System.out.println("Enter weight " + i + ":");
            userWeights [i] = k.nextDouble();
            
        }
        System.out.print("You entered: ");
        for(int i = 1; i <= numOfWeights; ++i) {
            System.out.print(userWeights[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= numOfWeights; ++i) {
            total += userWeights[i]; 
            average = total / numOfWeights;
            }
        System.out.println("Total weight: " + total);
        System.out.println("Average weight: " + average);
        
        double maxWeight = userWeights[0];
        for (int i = 1; i <= numOfWeights; ++i) {
            if (userWeights[i] > maxWeight) {
                maxWeight = userWeights[i]; 
            }
        }
        System.out.println("Max Weight: " + maxWeight);
    }
    
}
