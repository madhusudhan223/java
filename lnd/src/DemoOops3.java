import java.util.Scanner;
public class DemoOops3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two values for addition");
	int n1=sc.nextInt();
	
	int n2=sc.nextInt();
	add n=new add(n1,n2);
	n.method();
	
	System.out.println("\nEnter two values for mul");
	int n3 = sc.nextInt();
	int n4 = sc.nextInt();
	add m = new add(n3, n4);
	m.method1();
	
	System.out.println("\nEnter three values for sub");
	int n5 = sc.nextInt();
	int n6 = sc.nextInt();
	int n7 = sc.nextInt();
	add p = new add(n5, n6, n7);
	p.method2();
}
}
class add{
	private int i;
	private int j;
	private int k;
public	add(int a,int b){
		i=a;
		j=b;
	}
public add(int a, int b, int c) {
	i = a;
	j = b;
	k = c;
}
	void method() {
		System.out.println("Ans: " + (i+j));
	}
	void method1(){
		System.out.println("Ans: " + (i * j));
	}
	void method2() {
		System.out.println("Ans: " + (i - j - k));
	}
}