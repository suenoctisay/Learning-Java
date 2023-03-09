package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product01;

public class Program01 {
	public static void man(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criação de um novo produto
		Product01 product = new Product01();
			System.out.println("Enter product data: ");
			
			//nome
			System.out.println("Name: ");
			product.name = sc.nextLine();
			
			//preço
			System.out.println("Pirce: ");
			product.price = sc.nextDouble();
			
			//quantidade no estoque
			System.out.println("Quantity: ");
			product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		//adicionando produtos no estoque
		System.out.println();
		System.out.println("Enter the number of products to be in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		//removendo productos do estoque
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
