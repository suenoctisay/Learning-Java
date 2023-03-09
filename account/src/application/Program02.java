package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program02 {

	public static void main(String[] args) {
		Account acc = new Account(001, "Suelen", 100000.0);
		BusinessAccount bacc = new BusinessAccount(002, "Suelen", 0.0, 500.0);
		
		// ------------------------------------------------
		// UPCASTING 
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(003, "Pam", 0.0, 200.0);
		Account acc3 = new SavingsAccount(004, "Sam", 0.0, 0.01);
		
		// ------------------------------------------------
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
			// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan Completed!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update Completed!");
		}
		
		// ------------------------------------------------
		Account acc6 = new Account (006, "Ayla", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(007, "Ellie", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc8 = new BusinessAccount(00, "Jules", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
	}
}
