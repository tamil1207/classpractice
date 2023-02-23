package document;

import java.util.Scanner;

public class Scanneroe {
	public void odd(int x) {
		if (x % 2 == 0) {
			System.out.println("x is even number");
		} else {
			System.out.println("x is odd number");
		}
	}

	public static void main(String[] args) {
		try (Scanner scannerobj = new Scanner(System.in)) {
			System.out.print("enter the first number");
			int num = scannerobj.nextInt();
			Scanneroe obj = new Scanneroe();
			obj.odd(num);
		}
	}
}