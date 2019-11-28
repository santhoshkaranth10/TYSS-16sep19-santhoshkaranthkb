
public class BMW implements AutoMobile,AutoMobileWithAbs {
	
	public int gear() {
		System.out.println("gear() method of bmw");
		return 10;
	}
	
	public void gps() {
		System.out.println("gps() method of bmw");
	}
	
	public void abs() {
		System.out.println("abs() of bmw");
	}

}
