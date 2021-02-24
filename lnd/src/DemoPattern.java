import java.util.*;
public class DemoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows ");
int n=sc.nextInt();
for(int i=5;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
