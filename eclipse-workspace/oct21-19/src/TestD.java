
public class TestD {
	public static void main(String[] args) {
		
		Btm b = new Btm();
		b.swipe();
		int count = b.getCount();
		System.out.println("count is "+count);
		int totalCount = b.getTotalCount();
		System.out.println("total count is "+totalCount);
		

	}
}
