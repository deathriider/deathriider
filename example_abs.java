
    abstract class bike{
        abstract void run() ; 
    }
    
    class Honda extends bike{
        void run(){
            System.out.println("running safely..");
        }
    }
    
    public class example_abs {
        public static void main(String[] args) {
            bike obj = new Honda() ;
            obj.run() ;
        }
    }

