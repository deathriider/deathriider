import java.util.Scanner;

public class PrimeCheck {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("enter a number:");
 int a=sc.nextInt();
 sc.close();
 if (a==0||a==1){
 return;
 }
 for (int i=2;i<a/2;++i){
 if(a%i==0){
 System.out.println("not a prime number");
 return ;
 }
 else{
 System.out.println("prime number");
 }
 }
 }
}

    

