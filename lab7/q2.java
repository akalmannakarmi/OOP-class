// Write a Java program to create a class Shape with methods called getPerimeter() and 
// getArea(). Create a subclass called Circle that overides the getPerimeter() and getArea()
// methods to calculate the area and perimeter of a circle

public class q2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());
    }
}

abstract class Shape {
    abstract public double getPerimeter();
    abstract public double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
