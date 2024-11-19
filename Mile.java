import java.util.Scanner;

public class Mile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double Miles_to_km = 1.60934;// factor to be used for conversion

        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles *  Miles_to_km ;
        System.out.println("distance in kilometers is "+ kilometers );
        scanner.close();
    }
}
