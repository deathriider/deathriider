public class keywordsexception {
        public static void main(String[] args) {
        try {
        int[] arr = new int[2];
        arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index Out of Bounds");
        throw e; // Rethrow exception
    } finally {System.out.println("Finally block executed");}
    try {
    int result = 10 / 0;}
    catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
    } catch (Exception e) {
    System.out.println("General Exception");
    } finally {
    System.out.println("Finally block for second exception");
    }
    }
   }

