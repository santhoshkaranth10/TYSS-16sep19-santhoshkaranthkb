
public class TestE {
 public static void main(String[] args) {
	Student.cname = "Jspiders";
	Student s1 = new Student();
	  s1.name = "santhosh";
	  s1.usn = 101;
	  System.out.println("college name is "+Student.cname);
	  System.out.println( "name is" +s1.name);
	  System.out.println("usn is"+s1.usn);
	  
}
}
