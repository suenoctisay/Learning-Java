package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double perimetro = (a+b+c)/2.0;
		return Math.sqrt(perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c)); 
	}
}
