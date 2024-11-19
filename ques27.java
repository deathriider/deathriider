import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
        }
       }public class ques27 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
        validateAge(age);
        } catch (NegativeAgeException e) {
        System.out.println(e.getMessage());
        }
        }
        static void validateAge(int age) throws NegativeAgeException {
        if (age < 0) {
        throw new NegativeAgeException("Age cannot be negative.");
        }System.out.println("Age entered: " + age);
        }
    }
