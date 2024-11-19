class Multi1 extends Thread {
        public void run() {
            System.out.println("thread is running ...");
        }
        public static void main(String[] args) {
            Multi1 m = new Multi1() ;
            m.start();
        }
    }
     class Multi2 implements Runnable {
        public void run() {
            System.out.println("thread is running ...");
        }
    
        public static void main(String[] args) {
            Multi2 m1 = new Multi2() ;
            Thread t1 = new Thread(m1) ;
            t1.start();
        }
    }
    class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark() {System.out.println("barking...");}
    }
    class Babydog extends Dog{
        void weep(){System.out.println("weeping...");}
    }
    
    public class multilev_Inheritance {
        public static void main(String[] args) {
            Babydog bd = new Babydog() ;
            bd.weep();
            bd.bark() ;
            bd.eat() ;
        }
    }

