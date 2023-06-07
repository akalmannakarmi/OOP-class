// Create a class Rectangle with attributes length and width, each of which defaults to 1.
// Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods
// for both length and width. The set methods should verify that length and width are
// each floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class
// Rectangle.

class q3{
    public static void main(String []args) {
        Rectangle r1 = new Rectangle(4, 4);
        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
    }
}

class Rectangle{
    private
        float length=1;
        float width=1;
    
    public
        Rectangle(float l,float w){
            if(l>0.0 && l<20.0){
                length=l;
            }
            if(w>0.0 && w<20.0){
                width=w;
            }
        }
        float area(){
            return length*width;
        }
        float perimeter(){
            return 2*(length+width);
        }
}