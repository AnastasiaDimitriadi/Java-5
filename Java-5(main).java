//package package_1;
import HumanPackage.*;

public class MainClass
{
 public static void main(String[]args)
 {
	 Human h = new Human();
	 English e = new English("Agglia");
	 Greek g = new Greek("Athhna");
	 
	 h.setName("Xrhsths 1");
	 h.setAge(22);
	 
	 e.setName("Xrhsths 2");
	 e.setAge(25);
	 
	 g.setName("Xrhsths 3");
	 g.setAge(30);
	 
	 System.out.println("name:" + h.getName());
	 System.out.println("Age:" + h.getAge());
	 System.out.println("Name:" + e.getName());
	 System.out.println("Age:" + e.getAge());
	 System.out.println("Name:" + g.getName());
	 System.out.println("Age:" + g.getAge());
	 
	 h.sayHello();
	 e.sayHello();
	 g.sayHello();
 }
}
	 