
public class Student {

	String name;
	int age;
	int sid;
	String branch;
	long usn;

	public Student(String name,int age,int sid,String branch,long usn) {
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.branch = branch;
		this.usn = usn;
	}

	void display() {
		System.out.println("name is " +name);
		System.out.println("age is " +age);
		System.out.println("student id is " +sid);
		System.out.println("branch is " +branch);
		System.out.println("usn is " +usn);
	}

	public static void main(String[] args) {

		Student s1 = new Student("santhosh",21,101,"cse",1234567);
		s1.display();
		Student s2 = new Student("sharath",22,102,"is",234567);
		s2.display();
		Student s3 = new Student("supreeth",23,105,"ME",2345678);
		s3.display();
		Student s4 = new Student("shrinivas",24,106,"ME",3345678);
		s4.display();
		Student s5 = new Student("suraj",25,107,"ME",444345678);
		s5.display();
		Student s6 = new Student("madhan",26,108,"CSE",2345888);
		s6.display();
		Student s7 = new Student("madhu",27,109,"ME",5555558);
		s7.display();
		Student s8 = new Student("keerthi",28,110,"ME",276678);
		s8.display();
		Student s9 = new Student("sathish",29,111,"ME",212348);
		s9.display();
		Student s10 = new Student("rajesh",30,112,"cse",987654);
		s10.display();

	}
}

