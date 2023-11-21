import java.util.Scanner;

public class control{
    public static void main(String[] args){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("enter a number : ");
    //     int i = input.nextInt();
    //     for(int n = 0; n < i ; n++){
    //         if (n<10){
    //             System.out.println(n);
    //         }
    //     }

    //     switch () {
    //         case value:
                
    //             break;
        
    //         default:
    //             break;
    //     }

        int i =2;
        if (i < 1){
            System.out.println("The number is less than one.");
        }
        else if(i > 3){
            System.out.println("the number is greater than 3.");
        }
        else{
            System.out.println("the number is between 1 and 3.");
        }


        int mark = 68;
        switch(mark/10){
            case( 9) :
            case (8):
                System.out.println("A");
                break;
            case (7):
                switch(){

                }
                System.out.println("B");
                break;
            case (6):
            case(5):
                System.out.println("C");
                break;
            default:
                System.out.println("try again");
                break;
        }
    }
}