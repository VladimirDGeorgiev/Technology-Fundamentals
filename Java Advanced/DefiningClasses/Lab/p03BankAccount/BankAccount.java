package JavaAdvance.DefiningClasses.Lab.p03BankAccount;

public class BankAccount {
    private int countID = 1;
    private final static double DEFAULT_INTEREST_RATE = 0.02d;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = countID++;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public  double getInterest(int years) {

        return BankAccount.interestRate*years*this.balance;
    }
    public void deposit(double amaunt){
        this.balance+=amaunt;
    }
}
