package lab4;
// A palindrome is a sequence of characters that reads the same backward as for-ward. For
// example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
// and 11611. Write an application that reads in a five-digit integer and determines whether
// it’s a palindrome. If the number is not five digits long, display an error message and allow
// the user to enter a new value.
import java.util.Scanner;
public class q1 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter num:");
            num = sc.nextInt();
            if(num<10000 && num>99999){
                System.out.println("Needs to be 5 digits!");
            }else{break;}
        }
        int b=num;
        int a=0;
        while(b>0){
            a*=10;
            a+=b%10;
            b/=10;
        }
        if(a==num){
            System.out.println(a+" is a palindrome");
        }else{
            System.out.println(a+" is not a palindrome");
        }
    }
}
