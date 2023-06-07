// Create class SavingsAccount. Use a static variable annualInterestRate to store
// the annual interest rate for all account holders. Each object of the class contains a private
// instance variable savingsBalance indicating the amount the saver currently has on
// deposit. Provide method calculateMonthlyInterest to calculate the monthly interest
// by multiplying the savingsBalance by annualInterestRate divided by 12—this
// interest should be added to savings-Balance. Provide a static method
// modifyInterestRate that sets the annualInterestRate to a new value. Write a
// program to test class SavingsAccount. Instantiate two savingsAccount objects,
// saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set
// annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and
// print the new balances for both savers. Next, set the annualInterestRate to 5%,
// calculate the next month’s interest and print the new balances for both savers.
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