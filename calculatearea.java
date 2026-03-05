class Area {

    // Area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    // Area of rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.area(5);        // Square
        obj.area(4, 6);     // Rectangle
        obj.area(3.5);      // Circle
    }
}