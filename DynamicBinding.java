// Abstract base class
abstract class Shape {
    // Abstract method to compute area
    abstract void compute_area();
}

// Derived class: Triangle
class Triangle extends Shape {
    private double base, height;

    // Constructor to initialize dimensions
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of compute_area() for triangle
    @Override
    void compute_area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of compute_area() for rectangle
    @Override
    void compute_area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Triangle object
        Shape triangle = new Triangle(10.0, 5.0);
        triangle.compute_area(); // Calls Triangle's compute_area()

        System.out.println();

        // Create a Rectangle object
        Shape rectangle = new Rectangle(8.0, 4.0);
        rectangle.compute_area(); // Calls Rectangle's compute_area()
    }
}
