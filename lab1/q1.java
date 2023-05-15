package lab1;
// WAP to check the createst among two number entered by user.
import java.util.Scanner;
public class q1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.print("Enter two num:");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum:"+sum);
    }
}