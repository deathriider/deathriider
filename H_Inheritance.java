
 class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark() {System.out.println("barking...");}
    }
    class cat extends Animal{
        void meow() {System.out.println("meowing...");}
    }
    
    public class H_Inheritance {
        public static void main(String[] args) {
            cat c =new cat() ;
            c.eat() ;
            c.meow();
            // c.bark() ;
        }
    }

