package operators;

public class instanceofOP {
    public static void main(String []arg){
        Object obj = new String("Hello");
        boolean isString = (obj instanceof String);
        System.out.println(isString);
    }
}
