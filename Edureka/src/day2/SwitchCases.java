package day2;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Day : ");
		int daynum = scan.nextInt();

		switch (daynum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("TuesyDay");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Not a valid day");
		}
	}

}
