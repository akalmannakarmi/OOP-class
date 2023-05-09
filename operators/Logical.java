package operators;

public class Logical {
    public static void main(String []arg){
        boolean isTrue = true;
        boolean isFalse = false;
        boolean result1 = (isTrue && isFalse);
        System.out.println(result1);
        boolean result2 = (isTrue || isFalse);
        System.out.println(result2);
        boolean result3 = !isTrue;
        System.out.println(result3);
    }
}
