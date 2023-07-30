package lab9;
// WAP to calculate sum of squares and sum of square roots 
// if first ten natural numerbers implementing functions of 
// Math class.

public class q1 {
    public static void main(String[] args) {
        double sumOfSquares=0;
        double sumOfSquareRoots=0;
        for(int i=0;i<10;i++) {
            sumOfSquares+=Math.pow(i, 2);
            sumOfSquareRoots+=Math.sqrt(i);
        }
        System.out.println("Sum of Squares:"+sumOfSquares);
        System.out.println("Sum of Square Roots:"+sumOfSquareRoots);
    }
}
