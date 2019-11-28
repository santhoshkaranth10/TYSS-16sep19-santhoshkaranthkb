
public class TestC {
public static void main(String[] args) {
	Person.color = "white";
	Person.sleep();
	System.out.println("person color "+Person.color);
	
	System.out.println("*******************");
	Person p1 = new Person();
	p1.age = 22;
	p1.name = "santhosh";
	System.out.println("Person p1 age "+p1.age);
	System.out.println("Person p1 name "+p1.name);
	p1.color = "black";
	p1.sleep();
	System.out.println("**************");
    Person p2 = new Person();
    p2.age = 23;
    p2.name ="sharath";
    System.out.println("Person p2 age "+p2.age);
	System.out.println("Person p2 name "+p2.name);
    
	
}
}
