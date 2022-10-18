import java.util.Scanner;
public class arrays{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int age=input.nextInt();
        int i=0;
        while(i<=3){
            System.out.println("age in index:"+i+"is:" + age);
            i++;
        }
    }
}
