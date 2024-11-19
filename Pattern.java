import java.util.*;

public class Pattern {
    static void pattern1()
    {

        Scanner c = new Scanner(System.in);
        System.out.println("Hello world! Yo printing pattern 1(23)");
        int num1, count = 1 ;
        System.out.println("Enter the value of n");
        num1 = c.nextInt();

        int terms = 1 ;

        for(int i=0; i <num1;i++){

            for ( int j = 0 ; j < terms ; j++ )
            {
                System.out.print(count);
                System.out.print(" ");
                count++ ;

            }
            System.out.print("\n");
            terms+= 2 ;

        }
    c.close();

    }
    static void pattern2(){

        Scanner c = new Scanner(System.in);
        System.out.println("Hello world! Yo printing pattern 1(23)");
        int num1;
        System.out.println("Enter the value of n");
        num1 = c.nextInt();

       



        for( int i =  1 ; i < num1 ; i++ )
        {

            int space= num1-i-1;
            while (space!=0){

                System.out.print(" ");
                space--;
            }
         for (int h=i; h>1;h--)
         {
             System.out.print(h+" ");
         }
            for (int h=1; h<=i;h++)
            {
                System.out.print(h+" ");
            }
            System.out.println();

        }
     c.close();



    }

    public static void main(String[] args) {

        //pattern1();
        pattern2();




    }
}

