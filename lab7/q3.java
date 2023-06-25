// Write a Java program to create an interface IShape with the getArea() method. Create three 
// classes Rectangle, Circle and Triangle that implement the IShape interface. Implement the
// getArea() method for each of the three classes.

public class q3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + r1.getArea());
        
        Circle c1 = new Circle(2.5);
        System.out.println("Circle Area: " + c1.getArea());
        
        Triangle t1 = new Triangle(4, 6);
        System.out.println("Triangle Area: " + t1.getArea());
    }
}

interface IShape {
    double getArea();
}

class Rectangle implements IShape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements IShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements IShape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
