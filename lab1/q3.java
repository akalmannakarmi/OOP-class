package lab1;
// WAP to check whether the given number is prime or not
import java.util.Scanner;
public class q3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n; boolean flag=false;
        System.out.print("Enter num:");
        n = sc.nextInt();
        for(int i=n/2;i>1;i--){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(n==1 || n==0){
            flag = true;
        }
        if(flag){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
