import java.util.Scanner;
import java.util.Random;

public class exceptionhandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("enter value of a : ");
        int a = sc.nextInt() ;
        System.out.print("enter value of b : ");
        int b = sc.nextInt() ;
        int c  ;

        try{
            c = a/b ;
            System.out.println("value of c is : "+c);
        }
        catch (ArithmeticException e){
            System.out.println("value of b can't be zero");
            Random r = new Random() ;
            b = r.nextInt(10) ; 
        }
        finally{
            System.out.println("finally block");
        }
    }
}

