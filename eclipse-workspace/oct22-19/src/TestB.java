
public class TestB {
    static int a =25;
    int x;
	public static void add() {
		// only final access specifier is supported  for local variables
		final int a;
		final int b;
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is "+t.x);
	}
}
