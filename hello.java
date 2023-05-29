import java.util.Scanner;
class hello{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(n>0){
            if(isPrime(i)){
                System.out.print(i +" ");
                n--;
            }
            i++;
        }
    }
    public static boolean isPrime(int a){
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}