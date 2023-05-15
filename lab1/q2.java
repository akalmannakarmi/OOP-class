package lab1;
// WAP to calcualte factorial of input number
import java.util.Scanner;
public class q2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter num:");
        n = sc.nextInt();
        for(int i=n-1;i>0;i--){
            n*=i;
        }
        System.out.println("Factorial:"+n);
    }
}
