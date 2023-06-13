// Write a java program to implement static polymorphism to calculate the are of different shapes such as
// Rectangle, Square, Circle and Triangle
class q1{
    public static void main(String []args){
        System.out.println("Rectangle:"+area(2.0,3.0));
        System.out.println("Square:"+area(2.0f));
        System.out.println("Circle:"+area(7.0));
        System.out.println("Triangle:"+area(4.0f,9.0f));
    }
    public static double area(double length,double width){
        return length*width;
    }
    public static double area(float length){
        return length*length;
    }
    public static double area(double radious){
        return 22/7*radious*radious;
    }
    public static double area(float base,float height){
        return base*height/2;
    }
}