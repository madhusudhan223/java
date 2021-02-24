
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(j>=(n/2)-i && j<=n/2+i && j>=i-(n/2) && j<=n+(n/2)-1-i)
				 {
		System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
		
	}

	System.out.println();
	}

	}
}
