// Interface GeometricShape
interface GeometricShape {
    double PI = 3.14; // Definerer pi som en konstant
    double calculatePerimeter();
    double calculateArea();
}

// Circle implementerer GeometricShape
class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

// Rectangle implementerer GeometricShape
class Rectangle implements GeometricShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle implementerer GeometricShape
class Triangle implements GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private double base;

    public Triangle(double sideA, double sideB, double sideC, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Testprogram
public class GeometricTest {
    public static void main(String[] args) {
    run();
    }

    public static void run() {

        GeometricShape circle = new Circle(5);
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());

        GeometricShape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        GeometricShape triangle = new Triangle(3, 4, 5, 4, 3);
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }

}
