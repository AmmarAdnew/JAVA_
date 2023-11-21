import java.util.Scanner;
import java.lang.Math;

class operations {
    double x , y ;
    Scanner inpu = new Scanner(System.in);
    void add(){
        System.out.println();
        System.out.print("Enter the first number : ");
        x = inpu.nextDouble();
        System.out.print("Enter the second number : ");
        y = inpu.nextDouble();
        double l = x + y;  
        System.out.println("The sum of " + x + " and " + y + " is " + l + ".");
    }
    void subtract(){
        System.out.println();
        System.out.print("Enter the first number : ");
        x = inpu.nextDouble();
        System.out.print("Enter the second number : ");
        y = inpu.nextDouble();
        double l = x - y; 
        System.out.println("The difference of " + x + " and " + y + " is " + l + ".");
    }
    void mult(){
        System.out.println();
        System.out.print("Enter the first number : ");
        x = inpu.nextDouble();
        System.out.print("Enter the second number : ");
        y = inpu.nextDouble();
        double l = x * y; 
        System.out.println("The product of " + x + " and " + y + " is " + l + ".");
    }
    void div(){
        System.out.println();
        System.out.print("Enter the first number : ");
        x = inpu.nextDouble();
        System.out.print("Enter the second number : ");
        y = inpu.nextDouble();
        if(y != 0){
            double l = x / y; 
            System.out.println("The qoutiont of " + x + " and " + y + " is " + l + ".");
        }else{

        }
    }
    void remind(){
        System.out.println();
        System.out.print("Enter the first number : ");
        x = inpu.nextDouble();
        System.out.print("Enter the second number : ");
        y = inpu.nextDouble();
        double l = x % y; 
        System.out.println("The reminder of " + x + " when divided by " + y + " is " + l + ".");

    }
    // void sqrt(){
    //     return Math.sqrt(x);
    // }
    // double factorial(double x){
    //     return Math.factorial(x);
    // }
    // double 
}

public class mini_cal {
    public static void main(String[] args) {
        operations op = new operations();
        Scanner input = new Scanner(System.in);
        boolean t = true;

        while(t){//
            System.out.println();
            System.out.println("            Welcome to mini calculator ");
            System.out.println();
            System.out.println("Enter 1 : For Addition");
            System.out.println("Enter 2 : For Subtarction");
            System.out.println("Enter 3 : For Multiplication");
            System.out.println("Enter 4 : For Division");
            System.out.println("Enter 5 : For Remainder");
            System.out.println("Enter 6 : To Exit ");
            System.out.println();
            System.out.print("-> ");
            int a = input.nextInt();

            if (a > 0 && a <= 6 ){
                switch (a) {
                    case 1:
                        op.add();
                        break;
                    case 2:
                        op.subtract();
                        break;
                    case 3:
                        op.mult();
                        break;
                    case 4:
                        op.div();

                        break;
                    case 5:
                        op.remind();
                        break;
                    case 6:
                        t = false;
                        System.out.println("Thanks for using this program.");
                        break;
                    default:
                        break;

                }
            }else{
                System.out.println("Invalid input please try again.");
            }
            // if (a==6){
            //     t = false;
            // }

        }
        
    }
}

