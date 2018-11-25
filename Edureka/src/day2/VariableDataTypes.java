package day2;

public class VariableDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Premitive Data Types");
		byte a = 10;
		System.out.println("byte is a primitive :" + a);

		short b = 10;
		System.out.println("short is a primitive :" + b);

		int i = 10;
		System.out.println("int is a primitive :" + i);

		long e = 10;
		System.out.println("long is a primitive :" + e);

		double d = 10.33;
		System.out.println("double is a primitive :" + d);

		float f = 10.32f;
		// float g = 10.32;-- default is double which is bigger then float
		System.out.println("float is a primitive :" + f);

		char c = 'a';
		System.out.println("Char is a primitive :" + c);

		boolean bool = true;
		System.out.println("boolean is a primitive :" + bool);

		System.out.println("=================================================================");

		System.out.println("Print Non Premitive Data Types");

		String s = "String is a Non Premitive DataType";
		System.out.println(s);
	}

}
