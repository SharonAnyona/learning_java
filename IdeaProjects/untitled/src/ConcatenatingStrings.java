import java.util.Scanner;
public class ConcatenatingStrings {
    public static void main(String[]args){
        double studentsGpa =3.35 ;
        String StudentFirstName = "sharon";
        String StudentSecondName = "Anyona";
        Scanner input =new Scanner(System.in);
        String like = input.next();
        System.out.println("what do you want to update to?");
        if (like.equals("3.35")) {
            System.out.println(StudentFirstName + " " + StudentSecondName + " has a Gpa of " + studentsGpa);
        }else{
            System.out.println("sharon needs to read hard");
        }

    }
}
