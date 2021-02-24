import java.util.Scanner;
public class DemoOops {
public static void main(String[] args) {
	System.out.println("enter first employ");
	Emp m=new Emp();
	m.display();
	System.out.println("enter second employ");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int i=sc.nextInt();
	Emp n=new Emp(s,i);
	n.display();
	System.out.println("enter third employ");
	String name2=sc.next();
     int id2=sc.nextInt();
     Emp o=new Emp(name2,id2);
     o.display();
}
}
class Emp{
	Scanner sc=new Scanner(System.in);
      private String name="madhu";
	 private int id=223;
	
	public Emp() {
		
	}
	public Emp(String firstname,int id1) {
		name=firstname;
		id=id1;
	}
	 void display() {
		System.out.println(id);
		System.out.println(name);
	}
}


		
		
		