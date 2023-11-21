import java.util.Scanner;

public class input_user {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age;
        System.out.print("Please enter your age : ");
        age = obj.nextInt();
        System.out.println();
        System.out.println("Your age is " + age + ".");
    }
}
