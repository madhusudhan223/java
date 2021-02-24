import java.util.Scanner;
public class Oops2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
oop n=new oop();
//n.display();
}
}
class oop{
int n1;
int age;
String name;
public oop(int a,int b) {
	n1=a;
	age=b;
}
public oop(String name1){
	this(1234,25);
	name=name1;
}
public oop() {
	
	this("madhu");
	display();
}
 void display() {
	System.out.println("id :"+ n1);
	System.out.println("age :"+age);
	System.out.println("name :"+name);
	
}
}


												