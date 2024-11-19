import java.util.*;
public class PosNegcheck {
    public static void main(String[] args) {
        System.out.println("enter the number you want to check ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("given number is zero which is a non-negative number");
        }else if(num>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        } sc.close();

    }
}