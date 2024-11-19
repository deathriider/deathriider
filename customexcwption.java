
    class InvalidEquationException extends Exception {
        public InvalidEquationException(String message) {
        super(message);
        }
       }
       public class customexcwption {
        public static void main(String[] args) {
        try {
        int result = calculateEquation(10, 0); // Division by zero
        System.out.println("Result: " + result);
        } catch (InvalidEquationException e) {
        System.out.println("Error: " + e.getMessage());
        }
        try {
            int result = calculateEquation(10, 2);
            System.out.println("Result: " + result); // Valid operation
            } catch (InvalidEquationException e) {
            System.out.println("Error: " + e.getMessage());
            }
            }
            static int calculateEquation(int num1, int num2) throws InvalidEquationException {
            if (num2 == 0) {
            throw new InvalidEquationException("Cannot divide by zero.");
            }
            return num1 / num2;
            }
           }
           

