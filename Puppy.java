class Animal {
        void eat() {System.out.println("Animal eats food.");}
       }
       class Dog extends Animal {
        void bark() {System.out.println("Dog barks.");}
       }
       class Puppy extends Dog {
        void play() {System.out.println("Puppy plays.");}
        public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        }
       }
          

