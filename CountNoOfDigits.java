import java.util.Scanner ;

public class CountNoOfDigits  {
        public static void main(String[] args) {
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n to count no: of digits ");
        int num = sc.nextInt();
        while (num != 0) {
        num /= 10;
        ++count;
        }
        System.out.println("Number of digits : " + count);
        sc.close();
        }
       }
       

