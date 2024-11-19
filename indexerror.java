public class indexerror {
    
        public static void main(String[] args) {
        try {
        int[] arr = new int[5];
        arr[-1] = 10; // NegativeArrayIndexException
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Negative index accessed.");
        }
        try {
        int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero.");
        }
        }
       }
       

