
public class TestG {
	public static void main(String[] args) {

		FirstGen f = new FirstGen();
		f.msg();
		f.call();
		System.out.println("*****************");

		SecGen s = new SecGen();
		s.games();
		System.out.println("*******************");

		ThirdGen t = new ThirdGen();
		t.Camera();
		System.out.println("***************");

	}
}
