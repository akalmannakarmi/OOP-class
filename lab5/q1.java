// Write a java program to create a rectangle class & print area and perimeter of the
// rectangle.

class q1{
    public static void main(String []args) {
        Rectangle r1 = new Rectangle(4, 4);
        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
    }
}

class Rectangle{
    private
        float length;
        float width;
    
    public
        Rectangle(float l,float w){
            length=l;
            width=w;
        }
        float area(){
            return length*width;
        }
        float perimeter(){
            return 2*(length+width);
        }
}