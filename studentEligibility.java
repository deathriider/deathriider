import java.util.Scanner ;


public class studentEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("subject in Mathematics :");
        int maths = sc.nextInt();
        System.out.print("marks in Physics :");
        int physics = sc.nextInt();
        System.out.print("marks in Chemistry :");
        int chem = sc.nextInt();
        int total = maths + physics + chem ;
        int math_phy = maths + physics ;
        if((maths >= 60 && physics >= 50 && chem >= 40 && total >=200) || math_phy >= 150 ){
            System.out.println("Student is Eligible ");
        }else System.out.println("not eligible");
        sc.close();
    }
    
}
