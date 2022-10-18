import java.util.Scanner;
public class quadraticEquation {
    public static void main (String[]args){
        System.out.println("enter the value of b");
        Scanner Scanner= new Scanner(System.in);
        double b=Scanner.nextDouble();

        System.out.println("enter the value of a");
        double a=Scanner.nextDouble();

        System.out.println("enter the value of c");
        double c=Scanner.nextDouble();

        double x;
        x=(-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
        System.out.println("x="+x);


    }

}
