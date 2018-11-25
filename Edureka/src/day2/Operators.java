package day2;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		int i = 10;
		int a;
		int b;
		int c;

		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i > 11);

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for a");
		a = scan.nextInt();

		System.out.println("Enter the value for a");
		b = scan.nextInt();

		if (a > b) {
			System.out.println("a is greater then b");
		} else if (b > a) {
			System.out.println("b is grater then a");

		} else if (a == b) {
			System.out.println("a is equal to b");
		}

		System.out.println("===============================================================");
		System.out.println("Enter the value for c");
		c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println("a is greatest");
		} else if (a == b && a > c) {
			System.out.println("a and b are equal and greater then c");
		} else if (b < c && c > a) {
			System.out.println("c is greatest");
		} else if (a == c) {
			System.out.println("a and c are equal and less then b ");
		} else if (b == c) {
			System.out.println("b and c are equal and greater then a ");
		}

	}

}
