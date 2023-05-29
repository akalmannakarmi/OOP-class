package lab4;
// Write an application that calculates the product of the odd integers from 1 to 15.
public class q3 {
    public static void main(String []args) {
        int p=1;
        for(int i=1;i<=15;i+=2){
            p*=i;
        }
        System.out.println("Product:"+p);
    }
    
}
