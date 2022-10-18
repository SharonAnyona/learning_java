import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        System.out.println("are you happy");
        Scanner input = new Scanner(System.in);
        String like = input.next();
        if (like.equals("yes")) {
            System.out.println("good things are happening to you");

        } else {
            System.out.println("watch cartoon");
        }
    }
}