package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product02;

public class Program02 {
	public static void man(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			System.out.println("Enter product data");
			
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Pirce: ");
			double price = sc.nextDouble();
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product02 product = new Product02(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
