package lab3;
// A large company pays it's sales people on a comission basis.
// The sales people recieve $200 per week plus 9% of gross sales for the work.
// For example sales person who sells $5000 worth merchandise in a week receives $200 plus 9% of $5000 of total of $650.
// You have been supplied with list of the items sold by each sales person. The values of item sold by each salesperson. The values of these items are as follow:
// Item         Values
// 1            239.99
// 2            129.75
// 3            99.95
// 4            350.89
import java.util.Scanner;
public class q3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double itemValues[] = {239.99,129.75,99.95,350.89};
        double total=0;
        for(int i=1;i<=itemValues.length;i++){
            System.out.print("Item"+i+":");
            total += itemValues[i-1]*sc.nextInt();
        }
        total=total*9/100 + 200;
        System.out.println("Earnings:"+total);
    }
}
