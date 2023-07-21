package lab8;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no:");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a/b;
            System.out.println("Result:"+c);
        } catch (ArithmeticException e) {
            System.out.println("Exception:"+e);
        }
    }
}
