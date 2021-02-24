import java.util.Scanner;
public class DemoOops1 {
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two values for addition");
	int n=sc.nextInt();
	int n3=sc.nextInt();
	num t=new num(n,n3);
	t.num();

}
}
class num{
	private int n1;
     private int n2;
public num(int a,int b) {
		n1=a;
		n2=b;
	}
	public void num() {
		System.out.println("sum of two numbers :"+(n1+n2));
	}
}

	

	

