import java.util.Scanner;
class TooOlderException extends Exception {
 public TooOlderException(String message) {
    super(message);
}
}
class TooYoungerException extends Exception {
public TooYoungerException(String message) {
super(message);
}
}
public class ques25{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter candidate name: ");
String name = sc.nextLine();
System.out.print("Enter candidate age: ");
int age = sc.nextInt();
sc.close();
try {
checkEligibility(name, age);
} catch (TooOlderException | TooYoungerException e) {
System.out.println(e.getMessage());
}
}
static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
if (age > 45) {
throw new TooOlderException("Age too high. Candidate " + name + " is too old for the job.");
} else if (age < 20) {
throw new TooYoungerException("Age too low. Candidate " + name + " is too young for the job.");
} else {
System.out.println("Candidate " + name + " is eligible.");
}
}
}

