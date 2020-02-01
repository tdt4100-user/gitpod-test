package encapsulation;

class Account {
    private double balance;
    private double interestRate;

	public Account(final double balance, final double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
	}

	public double getBalance() {
		return this.balance;
    }

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(final double interestRate) {
		// TODO Auto-generated method stub

	}

	public void deposit(final double amount) {
		// TODO Auto-generated method stub

	}

	public void withdraw(final double amount) {
		// TODO Auto-generated method stub

	}

	public void addInterest() {
		// TODO Auto-generated method stub

	}

	public static void main(final String[] args) {
		System.out.println("Used for testing Account");
	}
}