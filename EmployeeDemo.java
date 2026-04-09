import java.util.*;

// Interface
interface Gross {
    double calculateGross();
}

// Employee class
class Employee {
    String name;
    int id;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Salary class implementing Gross
class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        hra = 0.2 * basic;
        da = 0.1 * basic;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        displayDetails();
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Salary emp = new Salary();

        emp.getDetails();
        emp.getSalary();
        emp.displaySalary();
    }
}