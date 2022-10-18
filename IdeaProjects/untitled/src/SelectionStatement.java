import java.util.Scanner;
public class SelectionStatement {
    public static void main(String [] args){
       System.out.println( "pick a number from 0 to 10");
        Scanner Scanner= new Scanner(System.in);
        int inputtedNum = Scanner.nextInt();

        if (inputtedNum >= 6)
        {System.out.println("genius");}
        else{System.out.println("great learner");}

        }
    }

