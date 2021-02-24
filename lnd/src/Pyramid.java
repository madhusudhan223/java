import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter no of rows");
int n=sc.nextInt();

for(int i=1;i<=n;i++) {
	for(int j=n-i;j>=1;j--) {
		System.out.print(" ");
	}
		for(int k=1;k<=i;k++){
		
			 System.out.print("* ");
		
		}
		
	
	System.out.println();
}
	}

}
