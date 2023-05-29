package lab4;
// Write a program in java to print all the prime numbers in the given range.
import java.util.Scanner;;
public class q5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range:");
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
