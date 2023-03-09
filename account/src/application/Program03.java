package application;

import entities.Account;
import entities.SavingsAccount;

public class Program03 {

	public static void main(String[] args) {
		
		// polimorfismo - variáveis do mesmo tipo comportando de formas diferentes
		Account x = new Account(1020, "Ellie", 1000.0);
		Account y = new SavingsAccount(1023, "Sue", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
	}
}