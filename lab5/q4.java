
class q4{
    public static void main(String []args){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1:"+saver1.balance());
        System.out.println("Saver2:"+saver2.balance());
        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1:"+saver1.balance());
        System.out.println("Saver2:"+saver2.balance());
    }
}
class SavingsAccount{
    private
        double savingsBalance=0.0;
        static double anualInterestRate=13;
    public 
        SavingsAccount(double balance){
            savingsBalance = balance;
        }

        void calculateMonthlyInterest(){
            savingsBalance += savingsBalance*anualInterestRate/12;
        }
        double balance(){
            return savingsBalance;
        }
        static void modifyInterestRate(double interest){
            anualInterestRate=interest;
        }
}