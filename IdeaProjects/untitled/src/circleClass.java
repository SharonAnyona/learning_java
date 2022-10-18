import java.util.Scanner;
class circleClass {

     double area;
     void area_circle() {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the radius of the circle");
         double radi = input.nextDouble();
         area=3.142*radi*radi;
         System.out.println("Area of circle is:"+area);
     }
 }
 class rectangle {
     double area;
     void rectangle_area() {
         Scanner val = new Scanner(System.in);
         System.out.println("Enter the  length and width of the rectangle ");
         double width = val.nextDouble();
         double length=val.nextDouble();
         area=length * width;
         System.out.println("Area of rectangle is:"+area);

     }
 }
     class cylinder{
         double volume;
         final double pie=3.142;
         void cylinder(){
             Scanner  cylinder= new Scanner(System.in);
             System.out.println("Enter the radius and height of the cylinder");
             double radius= cylinder.nextDouble();
             double height=cylinder.nextDouble();
             volume=pie*height*(radius*radius);
             System.out.println(" volume is:" +volume);

         }
     }

    class sphere{
        double volume,Radius;
        final double pie=3.142;
        void sphere(){
            Scanner sph = new Scanner(System.in);
            System.out.println("Enter the radius of the sphere");
            double Radius = sph.nextDouble();
            volume=4/3*pie*(Radius*Radius*Radius);
            System.out.println("volume of sphere is:"+volume);

        }
    }

    class Main{
        public static void main(String[]args){

            circleClass Cir_1=new circleClass();
            Cir_1.area_circle();


            rectangle ri=new rectangle();
            ri.rectangle_area();


            sphere sv=new sphere();
            sv.sphere();


            cylinder cyl1=new cylinder();
            cyl1.cylinder();


    }
    }



