package passwordmodifier_brandon;
import java.util.Scanner;

// Program takes a simple password and makes it stronger by replacing characters
// using the key below, and by appending "!" to the end of the input string.
// i becomes 1
// a becomes @
// m becomes M
// B becomes 8
// s becomes $

public class PasswordModifier_Brandon {

 
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String passWord;
        System.out.println("Enter in a password: ");
        passWord = k.nextLine();
        int i;
        String modified = "";
        
        for (i = 0; i < passWord.length(); ++i) {
            if (passWord.charAt(i) == 'i') {
                modified += "1";
            }
            else if (passWord.charAt(i) == 'a') {
                modified += "@";
            }
            else if (passWord.charAt(i) == 'm') {
                modified += "M";
            }
            else if (passWord.charAt(i) == 'B') {
                modified += "8";
            }
            else if (passWord.charAt(i) == 's') {
                modified += "$";
            }
            else {
                modified += passWord.charAt(i);
            }
        }
        System.out.println("New password: " + modified);
    }
        
        
 }
    

