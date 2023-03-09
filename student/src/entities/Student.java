package entities;

public class Student {
	public String name;
	public double grade01;
	public double grade02;
	public double grade03;
	
	public double finalGrade() {
		return grade01 + grade02 + grade03;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}