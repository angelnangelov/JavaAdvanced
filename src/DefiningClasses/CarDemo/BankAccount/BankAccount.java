package DefiningClasses.CarDemo.BankAccount;

public class BankAccount {
    private int id;
    private static int idCounter =1;
    private double balance;
    private static double interestRate;
    public BankAccount(){
        this.id = BankAccount.idCounter++;
        System.out.println("Account ID"+ this.id);
        interestRate = 0.02;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return (this.balance * interestRate) * years;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Deposited" + amount);
    }

    public int getId() {
       return this.id;
    }
}
