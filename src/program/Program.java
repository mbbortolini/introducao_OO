package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		
			
		System.out.println("Informe os dados do Funcionário");
		System.out.println("Name: ");
		x.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.println("Tax : ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ x);
		System.out.println();
		
		System.out.println("Which percentagem to increase salary? ");
		double percentage = sc.nextDouble();
		x.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("update data: "+ x);
		
		sc.close();
	}

}
