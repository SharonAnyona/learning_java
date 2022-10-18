import java.util.Scanner;
public class elseifLadder {
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
   int marks=input.nextInt();
    if(marks>=0 && marks<=39)

    {
        System.out.println("fail");
    }
       else if(marks>=40 && marks<=49)
        {
            System.out.println("pass");
        }
        else if(marks>=50 && marks<=99)
        {
            System.out.println("Distinction");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
