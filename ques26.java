 import java.util.Scanner;

class InvalidUsernameException extends Exception {
 public InvalidUsernameException(String message) {
    super(message);
 }
}
class InvalidPasswordException extends Exception {
 public InvalidPasswordException(String message) {
 super(message);
 }
}
public class ques26{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter username: ");
 String username = sc.nextLine();
 System.out.print("Enter password: ");
 String password = sc.nextLine();
 
 try {
 validateCredentials(username, password);
 } catch (InvalidUsernameException | InvalidPasswordException e) {
 System.out.println(e.getMessage());
 }
 }
 static void validateCredentials(String username, String password) throws InvalidUsernameException,
InvalidPasswordException {
 if (username.length() < 6) {
 throw new InvalidUsernameException("Username must be at least 6 characters long.");
 }
 if (!password.equals("admin123")) {
 throw new InvalidPasswordException("Password does not match.");
 }

 System.out.println("Login successful!");
 
 }
}

