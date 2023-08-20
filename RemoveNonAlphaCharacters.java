package removenonalphacharacters;
import java.util.Scanner;

// Program removes all non alpha characters from the given input.

public class RemoveNonAlphaCharacters {
    
    public static String removeNonAlpha(String userString) {
        
        userString = userString.replaceAll("[^a-zA-Z]", "");
        return userString; 
    }
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       String str1;
       str1 = k.nextLine();
       System.out.println(removeNonAlpha(str1));
       
    }
    
}
