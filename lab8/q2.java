package lab8;
// Write a program to enter your first name & last name & print the full name in upper case
// using string handling function.
import java.util.Scanner;
import java.lang.String;
public class q2 {
    public static void main(String[] args) {
        String fName,lName,FullName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:");
        fName = sc.nextLine();
        System.out.print("Enter Last Name:");
        lName = sc.nextLine();
        FullName=fName+" "+lName;
        FullName= FullName.toUpperCase();
        System.out.println("Full name:"+FullName);
    }
}
