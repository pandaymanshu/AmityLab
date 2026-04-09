import java.util.*;

interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll;
    double marks1, marks2;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        System.out.print("Enter Marks1: ");
        marks1 = sc.nextDouble();
        System.out.print("Enter Marks2: ");
        marks2 = sc.nextDouble();
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result extends Student implements Exam {
    double percent;

    public void percent_cal() {
        percent = (marks1 + marks2) / 2;
    }

    void display() {
        show();
        System.out.println("Percentage: " + percent + "%");
    }
}

public class ResultDemo {
    public static void main(String[] args) {
        Result r = new Result();

        r.getData();
        r.percent_cal();
        r.display();
    }
}