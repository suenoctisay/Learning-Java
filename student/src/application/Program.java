package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade01 = sc.nextDouble();
		student.grade02 = sc.nextDouble();
		student.grade03 = sc.nextDouble();
		
		System.out.printf("final grade: %.2f", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("failed");
			System.out.printf("missing %.2f points%n", student.missingPoints());
		}else {
			System.out.println("pass");
		}
		sc.close();
	}
}
