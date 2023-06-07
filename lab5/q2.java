// Create a class Circle & a data method to set the radius, another method to get area
// of circle. Test a circle class creating a TestCircle class.

class q2{
    public static void main(String []args) {
        Circle r1 = new Circle(7);
        System.out.println("Area:"+r1.area());
    }
}

class Circle{
    private
        double radius;
    
    public
        Circle(double r){
            radius = r;
        }
        double area(){
            return radius*radius*22/7;
        }
}