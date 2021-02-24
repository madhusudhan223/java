import java.util.Scanner;
public class DemoInnerClass {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter password");
String s= sc.next();
Outer o=new Outer();
o.doAuth(s);
/*Outer.Inner i= new Outer().new Inner();//if class is not private use this
i.m2();*/
}
}
class Outer{
	private String name="madhu";
	void doAuth(String pwd) {
		if(pwd.equals("Admin123")) {
			System.out.println("login Success");
		Inner i=new Inner();
		i.m2();
	}
		else {
			System.out.println("you dont have access,entered password is wrong ");
		}
	}
	

 private class Inner{
void m2() {
	System.out.println(name);
}
}
}