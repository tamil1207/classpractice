package document;

import java.util.Scanner;

public class Oddandeven {

	public void add(int x) {

		if (x%2 == 0)
		{
			System.out.println("given number is even number");
			}
		else 
		{
			System.out.println("given number is odd number");}
			}

	public static void main(String[] args) {
		Scanner scannerobj = new Scanner(System.in);
		System.out.print(" enter the number");
		int num1 = scannerobj.nextInt();
		Oddandeven obj=new Oddandeven();
		obj.add(num1);

	}
}