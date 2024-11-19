import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the percentage for grading :");
        int percentage = sc.nextInt();
        if(percentage >=90 && percentage <=100){
            System.out.println("grade is A");
        }else if (percentage >= 80){
            System.out.println("grade is B");
        }else if(percentage >= 70){
            System.out.println("grade is C");
        }else if(percentage >=60){
            System.out.println("grade is D ");
        }else if(percentage >= 40){
            System.out.println("grade is E");
        }else if(percentage <= 40 && percentage >=0){
            System.out.println("grade is F");
        }
        sc.close();
    }
}
