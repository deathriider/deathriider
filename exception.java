
    public class exception {
        public static void main(String[] args) {
            
            try{
                int data = 50 / 0 ;                     // throws an exception
            }
            catch (ArithmeticException e){
                System.out.println("In catch box");
                System.out.println(e);
                System.out.println("rest of the code");
            }
        }
    }

