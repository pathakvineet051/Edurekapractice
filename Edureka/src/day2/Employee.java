package day2;

public class Employee {

	int salary;
	int bonus;

	void CalculateSalary() {
		int totalSalary = salary + bonus;

		System.out.println("Total Salary = " + totalSalary);
	}

	public int CalculateSalary(int sal, int bonus) {
		int totalSalary = 0;
		totalSalary = sal + bonus;
		return totalSalary;
	}

}
