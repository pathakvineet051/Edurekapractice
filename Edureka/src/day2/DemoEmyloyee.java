package day2;

import java.util.Scanner;

public class DemoEmyloyee {

	public static void main(String[] args) {
		String empName;
		int sal = 0;
		int bonus = 0;
		Employee saurabh = new Employee();

		saurabh.salary = 100000;
		saurabh.bonus = 5000;
		saurabh.CalculateSalary();

		Employee emp = new Employee();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of Employee : ");
		empName = scan.next();

		System.out.println("Enter the Salary of " + empName + " = ");
		sal = scan.nextInt();

		System.out.println("Enter the bonus for " + empName + " = ");
		bonus = scan.nextInt();

		System.out.println("Total Salay of " + empName + " = " + emp.CalculateSalary(sal, bonus));

	}

}
