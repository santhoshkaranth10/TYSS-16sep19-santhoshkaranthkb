
public class Employee1 {
	String name;
	int eid;

	public Employee1(String name, int eid) {
		this.name= name;
		this.eid = eid;
	}

	void printDetails() {
		System.out.println("employee name is"+name);
		System.out.println("employee eid is"+eid);
		this.sayHello();
	}

	void sayHello()
	{
		System.out.println("hello "+name+" welcome to testyantra company");
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("deepika",123);
		e1.printDetails();
		Employee1 e2 = new Employee1("alia",234);
		e2.printDetails();
		Employee1 e3 = new Employee1("priyanka",356);
		e3.printDetails();
	}

}
