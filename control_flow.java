public class control_flow {
    public static void main(String [] args){

        // 0 1 2 

        for(int i = 0; i < 3 ; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Removing 3 from the loop.");
        System.out.println();

        // 0 1 2 4

        for( int i = 0 ; i < 5 ; i++){
            if (i==3){
                continue;
            }else{
                System.out.println(i);
            }
        }

        // The sum of 1 - 10 using for loop 
        System.out.println();
        System.out.print("The sum of 1 - 10 ");

        int con = 0;
        for(int i = 0; i <= 10; i++){
            con= con + i;
        }
        System.out.println("is "+con);

        // The sum of 1 - 10 using while loop 
        System.out.println();
        System.out.print("The sum of 1 - 10 ");

        int c = 0;
        int i = 0;
        while(i <= 10){
            c= c + i;
            i++;
        }
        System.out.println("is "+c);

        System.out.println();
        System.out.println("using for loop");
        System.out.println();
 
        // create a square of numbers using for loop

        for(int a = 1 ; a < 10;a++){
            for(int b = 1; b < 10 ; b++){
                System.out.print(a);
            }
            System.out.println();
        }

        // create a square of numbers using while loop

        System.out.println("using while loop");
        System.out.println();

        int a = 1 ;
        while( a < 10){
            int b = 1;
            while( b < 10 ){
                System.out.print(a);
                b++;
            }
            System.out.println();
            a++;
        }


    }
}
