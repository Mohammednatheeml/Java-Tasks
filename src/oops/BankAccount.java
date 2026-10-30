package oops;


//Encapsulation
public class BankAccount {
	
	    private long accountNumber;
	    private double balance;

	    BankAccount(long accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Invalid amount or insufficient balance");
	        }
	    }
	
	    public static void main(String[] args) {
	        BankAccount b = new BankAccount(101, 5000);

	        b.deposit(1000);
	        b.withdraw(2000);

	        System.out.println("Account Number: " + b.getAccountNumber());
	        System.out.println("Balance: " + b.getBalance());
	    }
	 }


