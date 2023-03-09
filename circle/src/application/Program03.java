package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator02;

public class Program03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator02.circumference(radius);
		double v = Calculator02.volume(radius);
		
		System.out.printf("circunference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator02.PI);
		
		sc.close();
	}
}
