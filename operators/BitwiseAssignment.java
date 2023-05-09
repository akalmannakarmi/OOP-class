package operators;

public class BitwiseAssignment {
    public static void main(String []arg){
        int a = 5;
        System.out.println(a);
        a &= 3;
        System.out.println(a);
        a |= 8;
        System.out.println(a);
        a ^= 6;
        System.out.println(a);
        a <<= 2;
        System.out.println(a);
        a >>= 1;
        System.out.println(a);
        a >>>= 3;
        System.out.println(a);
    }
}
