package Javaclasses;
import java.util.Scanner;
public class reverseString {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String Str = in.next();
            int StrLen = Str.length();

            // Use Str.charAt(index) in a loop to extract character at "index" from inStr
            // The String's index begins at 0 from the left.
            for (int i = StrLen - 1; i >= 0; --i) {  // Process the String from the right
           // System.out.println("The reverse string is"+Str.charAt);
            }
        }
    }

