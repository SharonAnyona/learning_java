package Javaclasses;

class Person {
    Person() {
        System.out.println("you belong to person class");
    }

    void display() {
        System.out.println("i am displaying");

    }

    double circle_area() {
        double area, radius, pie;
        pie = 3.142;
        radius = 7.0;
        area = pie * radius * radius;
        return area;
    }

    void rect_area(double width, double height) {
        double area, x, y;
        x = width;
        y = height;
        area = x * y;
        System.out.println("area of a rectangle is : " + area);
    }

    double squ_area(double side) {
        double area, s;
        s=side;
        area =s*s;
        System.out.println("the area of a square is:"+area);
        return area;
        }

        public static void main(String[]args){
            Person david = new Person();
            david.display();
            System.out.println("The area of a circle is :" + david.circle_area());
            david.rect_area(7.0,3.0);
            david.squ_area(2.0);
        }
    }







