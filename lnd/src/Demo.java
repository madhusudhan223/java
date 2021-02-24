import java.util.Scanner;
public class Demo {
public static void main(String a[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows");
	int n1=sc.nextInt();
	for(int i=0;i<n1;i++) {
		for(int j=0;j<=i;j++) {
			System.out.println(j);
		}
	}
	
	
	
	}
}

