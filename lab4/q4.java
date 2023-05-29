package lab4;
// Write an application that finds the smallest of several integers. Assume that the first value
// read specifies the number of values to input from the user.
import java.util.Scanner;;
public class q4 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter Data:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int smallest=a[0];
        for(int num:a){
            if(num<smallest){
                smallest=num;
            }
        }
        System.out.println("Smallest:"+smallest);
    }
}
