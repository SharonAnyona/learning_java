package Javaclasses;
import java.util.Scanner;
public class KeyBoardScanner {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a integer value");
        int val =input.nextInt();
        System.out.println("Enter a float value");
        float fl =input.nextFloat();
        System.out.println("Enter a double value");
        double dou =input.nextDouble();
        System.out.println("Enter a string ");
        String name =input.next();
    }
}
