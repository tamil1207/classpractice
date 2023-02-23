package document;

import java.util.Scanner;

public class Scannerdemo {
	public void add(int a, int b, int c) {
		int x = (a + b + c) / 3;
		System.out.print(x);
	}

	public static void main(String[] args) {
		try (Scanner scannerobj = new Scanner(System.in)) {
			System.out.print("enter the first number");
			int num1 = scannerobj.nextInt();
			System.out.print("enter the second number");
			int num2 = scannerobj.nextInt();
			System.out.print("enter the third number");
			int num3 = scannerobj.nextInt();
			Scannerdemo obj = new Scannerdemo();
			obj.add(num1, num2, num3);
		}

	}
}
