package Javaclasses;
import java.util.Scanner;
public class Circumference {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double radius=input.nextDouble();
        final double pi =3.142;
        double area;
        double circumference;
        area = pi*radius*radius;
        circumference=2*pi*radius;
        System.out.println("Area of the circle is:"+area);
        System.out.println("circumference of the circle is:"+circumference);
    }

}
