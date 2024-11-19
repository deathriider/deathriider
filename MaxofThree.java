import java.util.*;

public class MaxofThree {
    public static void main(String[] args) {
        System.out.println("enter the three no: you want to compare");
        System.out.print("enter a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter b");
        int b = sc.nextInt();
        System.out.print("enter c");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is the maximum from the three");
        }else if(b>a && b>c){
            System.out.println("b is the maximum of the three");
        }else if(c>a && c>b){
            System.out.println("c is maximum of the three");
        }else if (a==b && a>c){
            System.out.println("a and b is the maximum number");
        }else if (a>b && a==c){
            System.out.println("a and c is the maximum number");
        }else if(b==a && b>c){
            System.out.println("b and a is the maximum of the three");
        }else if(b>a && b==c){
            System.out.println("b and c is the maximum of the three");
        }else if (a == b && a== c){
            System.out.println("all are equal");
        }
        sc.close();
    }
    
}
