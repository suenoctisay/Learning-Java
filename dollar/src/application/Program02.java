package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter convert = new CurrencyConverter();
		
		System.out.print("Dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("Dollars to be bought: ");
		double value = sc.nextDouble();
		
		double reais = convert.currencyConverter(dollar, value);
		
		System.out.printf("Amount to be paid in reais: %.2%n", reais);
		
		sc.close();
	}
}
