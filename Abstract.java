package JavaCoding;

// Abstract Class
abstract class Shape {
    double side, area, perimeter;

    // Parameterized Constructor
    Shape(double side) {
        this.side = side;
    }

    // Abstract Methods
    abstract void calculateArea();
    abstract void calculatePerimeter();

    // Concrete Method
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

// Triangle Class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        super(0);
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    void calculatePerimeter() {
        perimeter = base + height + Math.sqrt(base * base + height * height);
    }

    void display() {
        System.out.println("\nTriangle:");
        super.display();
    }
}

// Rectangle Class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super(0);
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        area = length * width;
    }

    void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    void display() {
        System.out.println("\nRectangle:");
        super.display();
    }
}

// Circle Class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super(0);
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("\nCircle:");
        super.display();
    }
}

// Square Class
class Square extends Shape {

    Square(double side) {
        super(side);
    }

    void calculateArea() {
        area = side * side;
    }

    void calculatePerimeter() {
        perimeter = 4 * side;
    }

    void display() {
        System.out.println("\nSquare:");
        super.display();
    }
}

// Cube Class
class Cube extends Shape {

    Cube(double side) {
        super(side);
    }

    void calculateArea() {
        area = 6 * side * side; // Surface Area
    }

    void calculatePerimeter() {
        perimeter = 12 * side; // Total edge length
    }

    void display() {
        System.out.println("\nCube:");
        super.display();
    }
}

// Main Class
public class Abstract {
    public static void main(String[] args) {

        Triangle t = new Triangle(3, 4);
        t.calculateArea();
        t.calculatePerimeter();
        t.display();

        Rectangle r = new Rectangle(5, 3);
        r.calculateArea();
        r.calculatePerimeter();
        r.display();

        Circle c = new Circle(7);
        c.calculateArea();
        c.calculatePerimeter();
        c.display();

        Square s = new Square(4);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        Cube cu = new Cube(3);
        cu.calculateArea();
        cu.calculatePerimeter();
        cu.display();
    }
}