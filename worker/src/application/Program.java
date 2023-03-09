package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		// entrada de dados
		System.out.println("WORKER DATA");
		
		System.out.print("Department: ");
		String workerDepartment = sc.nextLine();
		
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		// criação de um novo objeto
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(workerDepartment));
		
		// quantidade de contratos
		System.out.print("How many contracts have this worker? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		// adicionando contratos ao trabalhador
		for (int i=1; i<=n; i++) {
			System.out.println("CONTRACT #" + i);
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Contracted hours: ");
			int hours =  sc.nextInt();
			
			HourContract contract =  new HourContract (contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
			System.out.println();
		}
		
		System.out.println();
		
		// saída de dados
		System.out.print("Month and Year to calculate income (MM/YYYY): ");
		String month_year = sc.next();
		int month = Integer.parseInt(month_year.substring(0, 2));
		int year = Integer.parseInt(month_year.substring(3));
		
		System.out.println();
		
		System.out.println("Name: " + workerName);
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + month_year + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
