import java.util.Scanner;

public class OddnumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
        a[i] = sc.nextInt();
        }
        System.out.println("Given array ");
        for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] +"  ");
        }
        System.out.println();
        int sumOdd = 0 ;
        for(int i = 0 ; i < n ; i++){
        if(a[i]%2 !=0){
            sumOdd = sumOdd + a[i];
        }
    }
    System.out.println("sum of odd numbers is "+ sumOdd);
    sc.close();
}
}
