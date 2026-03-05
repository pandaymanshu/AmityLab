class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Constructor with one parameter
    Student(int i) {
        id = i;
        name = "Not Assigned";
    }

    // Constructor with two parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {

        // Calling different constructors
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Rahul");

        s1.display();
        s2.display();
        s3.display();
    }
}