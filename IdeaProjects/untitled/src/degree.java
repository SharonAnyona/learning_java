import java.util.Scanner;
public class degree {
    public static void main (String[]args){
        System.out.println("input temp in degrees celsius ");
        double  Fahrenheits;
        Scanner Scanner= new Scanner (System.in);
        double tempInDegrees = Scanner.nextDouble();

        Fahrenheits=(tempInDegrees*1.8)+32;
        System.out.println(Fahrenheits);
    }
}
