// Write a java program to implement the dynamic polymorphism for the qno1.

class q2{
    public static void main(String []args){
        Base r = new Rectangle(2,3);
        Base s = new Square(2);
        Base c = new Circle(7);
        Base t = new Triangle(4,9);
        System.out.println("Rectangle:"+r.area());
        System.out.println("Square:"+s.area());
        System.out.println("Circle:"+c.area());
        System.out.println("Triangle:"+t.area());
    }
}

abstract class Base{
    public abstract double area();
}
class Rectangle extends Base{
        double length,width;
        Rectangle(double l,double b){
            this.length=l;
            this.width=b;
        }
        public double area(){
            return length*width;
        }
}
class Square extends Base{
        double length;
        Square(double l){
            this.length=l;
        }
        public double area(){
            return length*length;
        }
}
class Circle extends Base{
        double radious;
        Circle(double r){
            this.radious=r;
        }
        public double area(){
            return 22/7*radious*radious;
        }
}
class Triangle extends Base{
        double base,height;
        Triangle(double base,double height){
            this.base=base;
            this.height=height;
        }
        public double area(){
            return base*height/2;
        }
}