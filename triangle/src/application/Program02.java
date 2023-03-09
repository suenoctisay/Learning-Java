package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//leitura do primeiro triângulo X
		System.out.println("Entre com as medidas do triângilo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//leitura do segundo triângulo Y 
		System.out.println("Entre com as medidas do triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Triângulo X área: %.4%n", areaX);
		System.out.printf("Triângulo Y área: %.4%n", areaY);
		
		if (areaX > areaY){
			System.out.println("Maior área é: X");
		}else {
			System.out.println("Maior área é: Y");
		}
		
		sc.close();
	}

}
