package document;

public class funmethod {
	// without argument without return
	public void add() {
		int a, b, c;
		a = 5;
		b = 25;
		c = a - b;
		System.out.print(c);
	}

	public static void main(String[] args) {
		funmethod obj = new funmethod();
		obj.add();
	}
}
