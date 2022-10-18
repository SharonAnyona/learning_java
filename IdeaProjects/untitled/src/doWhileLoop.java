public class doWhileLoop {
    public static void main(String[]args) {
        /* displaying menu title*/
        System.out.println("Hotel Menu");
        /* declare variable time as string */
        double time;
        String hours;
        time=0.0;
        do {
            /*
            Displaying the menu items and time
             */
            System.out.println("BreakFirst" + time);
            System.out.println("lunch" + time);
            System.out.println("dinner" + time);
            System.out.println("Exit" + time);
            time+=5;
        }while(time<=20.0);
    }
}
