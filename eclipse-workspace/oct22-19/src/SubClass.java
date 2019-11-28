
public class SubClass extends SuperClass{

	SubClass(){
		super();
		System.out.println("subclass constructor");
	}

	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*****************");
		super.superClassMethod();
		superClassMethod();
		
	}
}



