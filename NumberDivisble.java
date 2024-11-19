import java.util.Scanner ;

public class NumberDivisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numberto check whether its divisible :");
        int num = sc.nextInt();
        System.out.print("enter the number for divisibility ");
        int divisible = sc.nextInt();
        if(num % divisible == 0){
            System.out.println(num +" is divisible by "+ divisible);
        } else System.out.println("not divisible");
        sc.close();
    }
}
