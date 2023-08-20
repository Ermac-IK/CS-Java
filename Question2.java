package question.pkg2;

/*
Write a method that takes a non negative integer and returns the sum
of digits. For example, if 42339 is passed as the parameter, the method should return 21.
Note: Use a paper and pencil to figure out the algorithm. Exploit integer division and
remainder operator. Do not convert the integer into a string and convert each character
to a number. That answer will not be accepted
*/
// Name: William Brandon

public class Question2 {

    
    public static void main(String[] args) {
        int test1 = 42339;
        
        if (test1 > 10000) {
            int digitFive = Math.floorDiv(test1, 10000);
            int digitFour = Math.floorDiv(test1, 1000) - (digitFive * 10);
            int digitThree = Math.floorDiv(test1, 100) - (digitFive * 100) - (digitFour * 10);
            int digitTwo = Math.floorDiv(test1, 10) - (digitFive * 1000) - (digitFour * 100) - (digitThree * 10);
            int digitOne = Math.floorDiv(test1, 1) - (digitFive * 10000) - (digitFour * 1000) - (digitThree * 100) - (digitTwo * 10);
            System.out.println(digitFive);
            System.out.println(digitFour);
            System.out.println(digitThree);
            System.out.println(digitTwo);
            System.out.println(digitOne);
            System.out.println(digitFive + digitFour+ digitThree + digitTwo + digitOne);
        }
        
        
        }
        
    }
    
