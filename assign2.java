
    class Vehicle {
        protected String regnNumber, color, ownerName;
        protected int speed;
        Vehicle(String regnNumber, String color, String ownerName, int speed) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        }
        void showData() {System.out.println("This is a vehicle class");}
       }
       class Bus extends Vehicle {
        private String routeNumber;
        Bus(String regnNumber, String color, String ownerName, int speed, String routeNumber) {
        super(regnNumber, color, ownerName, speed);
        this.routeNumber = routeNumber;
        }
        @Override
        void showData() {
        super.showData();
        System.out.println("Bus Details: " + regnNumber + ", " + color + ", " + ownerName + ", " + speed + 
      "km/h"+ "Route: " + routeNumber);
        }
       }
       class Car extends Vehicle {
        private String manufacturerName;
 Car(String regnNumber, String color, String ownerName, int speed, String manufacturerName) {
 super(regnNumber, color, ownerName, speed);
 this.manufacturerName = manufacturerName;
 }
 @Override
 void showData() {
 super.showData();
 System.out.println("Car Details: " + regnNumber + ", " + color + ", " + ownerName + ", " + speed + " km/h"
+ "Manufacturer: " + manufacturerName);
 }
}
public class assign2 {
 public static void main(String[] args) {
 Bus bus = new Bus("KA01-1234", "Red", "John", 60, "101");
 bus.showData();
 Car car = new Car("KA05-6789", "Blue", "Alice", 120, "Toyota");
 car.showData();
 }
}


