package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Account number:");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Name: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Value: ");
			double balance = sc.nextDouble();
			account = new Account (number, holder, balance);
		}else {
			account = new Account (number, holder);
		}
		
		System.out.println();
		System.out.println("ACCOUNT DATA");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("UPDATED ACCOUNT DATA");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdrawtValue = sc.nextDouble();
		account.withdraw(withdrawtValue);
		
		System.out.println();
		System.out.println("UPDATED ACCOUNT DATA");
		System.out.println(account);

		sc.close();
	}

}
