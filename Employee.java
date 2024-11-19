import java.util.Scanner;

class Employee {
 int emp_id;
 String emp_name;
 double basic_salary;
 Employee(int emp_id, String emp_name, double basic_salary) {
 this.emp_id = emp_id;
 this.emp_name = emp_name;
 this.basic_salary = basic_salary;
 }
 void calculateGrossSalary() {
 double gross_salary = basic_salary + (0.2 * basic_salary) + (0.1 * basic_salary); // Example for HRA and DA
 System.out.println("Gross Salary of " + emp_name + " is: " + gross_salary);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter employee ID: ");
 int emp_id = sc.nextInt();
 sc.nextLine(); // Consume newline character
 System.out.print("Enter employee name: ");
 String emp_name = sc.nextLine();
 System.out.print("Enter basic salary: ");
 double basic_salary = sc.nextDouble();
 Employee emp = new Employee(emp_id, emp_name, basic_salary);
 emp.calculateGrossSalary();
 sc.close();}
 
}

