package operators;

public class Bitwise {
    public static void main(String []arg){
        int a = 5;
        int b = 3;
        int result1 = (a & b);
        System.out.println(result1);
        int result2 = (a | b);
        System.out.println(result2);
        int result3 = (a ^ b);
        System.out.println(result3);
        int result4 = (~a);
        System.out.println(result4);
    }
}