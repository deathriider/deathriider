import java.util.Scanner ;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number upto which sum :");
        int n =sc.nextInt();
        int sum = 0;
        for(int i =0 ; i <= n ; i++){
            sum = sum +i ;
        }
         System.out.println("sum is "+ sum);
         sc.close();    
    }
}
