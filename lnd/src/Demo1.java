import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int n=sc.nextInt();
		int coef=1;
		for(int i=0;i<n;i++) {
			for(int k=n-i;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				if(i==0 ||j==0) {
				System.out.print( "1 " );
				}
				else  {
					coef=coef*(i-j+1)/j;
					System.out.print(coef+" ");
				}
			
			}
			System.out.println();
		}
	}
}


