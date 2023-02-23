package document;

public class funmeth {
	public int funmet() {
		// without argument with return
		int a, b, c;
		a = 96;
		b = 2;
		c = a * b;
		return c;
	}
public static void main(String[] args) {
		funmeth obj = new funmeth();
		System.out.println(obj.funmet());

	}

}
