import java.util.Scanner;
    class ThreeDObject {
        double volume() {return 0;}
        double surfaceArea() {return 0;
        }}
       class Box extends ThreeDObject {
        double length, width, height;
        Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        }
        @Override
        double volume() {return length * width * height;}
        @Override
        double surfaceArea() {return 2 * (length * width + width * height + height * length);}
       }
       class Cube extends Box {
        Cube(double side) {
        super(side, side, side);
        }
       }
       class Cylinder extends ThreeDObject {
        double radius, height;
        Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        }
        @Override
        double volume() {return Math.PI * radius * radius * height;}
        @Override
        double surfaceArea() {return 2 * Math.PI * radius * (radius + height);}
       }
       class Cone extends ThreeDObject {
        double radius, height;
        Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
            }
            @Override
            double volume() {return (1.0 / 3) * Math.PI * radius * radius * height;}
            @Override
            double surfaceArea() {return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));}
           }
           public class assign {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Box dimensions (length width height): ");
            Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println("Box Volume: " + box.volume());
            System.out.println("Box Surface Area: " + box.surfaceArea());
            System.out.print("Enter Cube side: ");
            Cube cube = new Cube(sc.nextDouble());
            System.out.println("Cube Volume: " + cube.volume());
            System.out.println("Cube Surface Area: " + cube.surfaceArea());
            System.out.print("Enter Cylinder radius and height: ");
            Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
            System.out.println("Cylinder Volume: " + cylinder.volume());
            System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
            System.out.print("Enter Cone radius and height: ");
            Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
            System.out.println("Cone Volume: " + cone.volume());
            System.out.println("Cone Surface Area: " + cone.surfaceArea());
            
        sc.close();}
           }
           

