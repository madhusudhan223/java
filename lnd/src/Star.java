import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
