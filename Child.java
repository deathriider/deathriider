
    class Parent {
        static void display() {
        System.out.println("Parent's static method");
        }
       }
       class Child extends Parent {
        static void display() {
        System.out.println("Child's static method");
        }
        public static void main(String[] args) {
        Parent.display(); // Static method hiding
        Child.display(); // Static method hiding
        }
       }
       

