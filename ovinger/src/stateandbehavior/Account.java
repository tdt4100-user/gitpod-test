package stateandbehavior;

public class Account {

    private double balance;
    private double interestRate;

    public Account() {

    }

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            return;
        }

    }

    public void addInterest() {
        deposit((this.balance * this.interestRate) / 100);
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", interestRate=" + interestRate + "]";
    }

    public static void main(String[] args) {
        Account acc = new Account(10, 0.01);

        for (int i = 0; i < 100000; i++) {
            acc.addInterest();
        }

        System.out.print(acc);

    }

}
