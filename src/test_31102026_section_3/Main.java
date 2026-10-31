package test_31102026_section_3;

public class Main {
	 public static void main(String[] args) {
	        BankAccount b = new BankAccount(101, 5000);
	        b.deposit(1000);
	        b.withdraw(2000);
	        System.out.println("Account Number: " + b.getAccountNumber());
	        System.out.println("Balance: " + b.getBalance());
	        
	        
	        PaymentClass payment = new UPIPaymentClass();
	        PaymentClass payment1 = new CardPayment();
	        PaymentClass payment2= new CashPayment();
	        
	        payment.payment();
	        payment1.payment();
	        payment2.payment();
	        
	        
	        Employee E1 = new Developer(1, "Natheem", "full stack");
	        Employee E2 = new Manager(1, "Alex", "Manager");
	        E1.displayDetails();
	        E2.displayDetails();
	        
	        Shape area = new CircleImplements();
	        Shape area1 = new RectangeImplements();
	        area1.calculateArea();
	        area.calculateArea();
	        
	        
	        
	    }
}
