
public class TestV {
public static void main(String[] args) {
	
	  Cow c = new Cow();
      c.name = "gowri";
      c.color = "white";
      System.out.println("cow name is" +c.name);
      System.out.println("cow color is" +c.color);
      c.eat();
      c.sleep();
      
      
      System.out.println("*********************");
      
      Cow c1 = new Cow();
      c1.name = "ganga";
      c1.color = "white";
      System.out.println("cow name is" +c1.name);
      System.out.println("cow color is" +c1.color);
      c1.eat();
      c1.sleep();
}
}
