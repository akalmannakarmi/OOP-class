package lab9;


// WAP to push first five even numbers in stack, pop them and
// display the sum
import java.util.Stack;
public class q2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 2; i <= 10; i += 2) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println("Sum of the first five even numbers: " + sum);
    }
}
