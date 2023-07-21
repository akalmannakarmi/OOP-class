// Write a program to implement default and prameterized constructor in java.

class q4{
    public static void main(String []args) {
        Rectangle r1 = new Rectangle(4, 4);
        Rectangle r2 = new Rectangle();
        System.out.println("Area1:"+r1.area());
        System.out.println("Area2:"+r2.area());
    }
}

class Rectangle{
    private float length,width;
    
    public Rectangle(){
        length=1;
        width=1;
    }
    public Rectangle(float l,float w){
        length=l;
        width=w;
    }
    public float area(){
        return length*width;
    }
}