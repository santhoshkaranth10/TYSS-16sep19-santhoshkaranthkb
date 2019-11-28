
public class Employee {

	String name;
	int eid;

	public Employee(String ename, int empeid) {
		name = ename;
		eid = empeid;
	}
	void printDetails() {
		  System.out.println("employee name is"+name);
		  System.out.println("employee eid is"+eid);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("santhosh",143);
		e1.printDetails();

		Employee e2 = new Employee("sharath",121);
		e2.printDetails();

		Employee e3 = new Employee("supreeth",122);
		e3.printDetails();
	}
}
