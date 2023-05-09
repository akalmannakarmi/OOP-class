package operators;

public class Relational {
    
    public static void main(String []arg){
        int a = 5;
        int b = 3;
        boolean isEqual = (a == b);
        System.out.println(isEqual);
        boolean isNotEqual = (a != b);
        System.out.println(isNotEqual);
        boolean isGreater = (a > b);
        System.out.println(isGreater);
        boolean isLess = (a < b);
        System.out.println(isLess);
        boolean isGreaterOrEqual = (a >= b);
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = (a <= b);
        System.out.println(isLessOrEqual);
    }
}
