package application;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("Dollars to be bought: ");
		double value = sc.nextDouble();
		
		double reais = CurrencyConverter(dollar, value);
		
		System.out.printf("Amount to be paid in reais: %.2%n", reais);
		
		sc.close();
	}
	public static double CurrencyConverter(double dollar, double value) {
		return dollar * value;
	}
}
