package lab1;
// WAP to check whether a number is exactly divisible by 5 or not
import java.util.Scanner;
public class q4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter num:");
        n = sc.nextInt();
        if(n%5==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
}
