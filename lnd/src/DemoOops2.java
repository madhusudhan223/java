import java.util.Scanner;
public class DemoOops2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter 1st employ");
	String n=sc.next();
	int i=sc.nextInt();
	num1 a=new num1(n,i);
	a.display();
	System.out.println("enter second employ");
	String n1=sc.next();
	int i1=sc.nextInt();
	num1 b=new num1(n1,i1);
	b.display();
	
}
}
class num1{
	private String name;
	private int id;
	//num1(String s){
	//name=s;
	//}
	num1(String a,int id1){
		name=a;
		id=id1;
	}
	num1(){
		
	}
		void display() {
			System.out.println(name);
			System.out.println(id);
			
		}
	}
