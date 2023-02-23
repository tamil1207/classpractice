package document;

public class Arraysum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8 };
		int x = a.length;
		int y = b.length;
		int[] c = new int[x + y];

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);
		}

	}
}
