import java.util.Scanner;

public class SmallestelemntinArray {
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
    int minValue = a[0];
    for (int i = 0; i < a.length; i++) {
        if (a[i] < minValue){
        minValue = a[i];
        }
    }
    System.out.println("Smallest element present in given array: " + minValue);   
    
    sc.close();
}
}
    

