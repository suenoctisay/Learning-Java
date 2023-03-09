package application;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		//leitura do primeiro triângulo X
		System.out.println("Entre com as medidas do triângilo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		//leitura do segundo triângulo Y 
		System.out.println("Entre com as medidas do triângulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		//calculo da área X
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p* (p - xA)*(p - xB)*(p - xC));
		
		//calculo da área Y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p* (p - yA)*(p - yB)*(p - yC));
		
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
