// Write a java program to implement the data abstraction in java.
class q3{
    public static void main(String[] args){
        Greet g1 = new Greet();
        g1.hi();
    }
}
abstract class Base{
    abstract public void hi();
}
class Greet extends Base{
    public void hi(){
        System.out.println("Hello Sir!");
    }
}