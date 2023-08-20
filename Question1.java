package question.pkg1;

// Name: William Brandon
/*Write a method to print all pairs of positive integers, (i, j), such that
0 < i < j < n and (i3 + 2ij + 1)/(ij + 3) is an integer. Here n is an integer and n > 2.
Note: Your method should take n as a parameter and print all valid pairs as (i, j). Show
the pairs corresponding to n = 100 as a test case. */

public class Question1 {

    public static void main(String[] args) {
        int i;
        int j;
        int n;
        double intSolution = 1;
        
        for (i = 1; i <= 100; ++i){
            for (j = 1; j <= 100; ++j) {
                intSolution = ((Math.pow(i, 3) + 2*i*j + 1) / (i*j+3)); 
                    if (intSolution == (int)intSolution && (j > i)) {
                        System.out.println("(" + i + "," + j + ")"); 
                    }
                }
        }
    
    
 }
    
}
