import java.util.Scanner;
public class Oops1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range to display sum");
	int n=sc.nextInt();
	int n1=sc.nextInt();
	natural a=new natural(n,n1);
	
	a.method();
}
}
class natural{
	int a;
	int b;
	public natural(int c,int d){
		a=c;
		b=d;
	}
	void method() {	
		int count=0;
		for(int i=a;i<=b;i++) {
			count=count+i;
		}
		System.out.println("Sum of natural numbers of given range is \n"+count);
	}
}