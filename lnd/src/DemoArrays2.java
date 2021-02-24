import java.util.Scanner;
public class DemoArrays2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter no.of rows and columns");
	int r=sc.nextInt();
	int c=sc.nextInt();

	int x[][]=new int[r][c];
	int y[][]=new int[r][c];
	int z[][]=new int[r][c];
	System.out.println("enter first matrix");
			for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			x[i][j]=sc.nextInt();
		}
	}
			System.out.println("enter second matrix");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			y[i][j]=sc.nextInt();
		}
	}
for(int k=0;k<r;k++) {
for(int l=0;l<c;l++) {
					z[k][l]=x[k][l]+y[k][l]	;
		}
}
for(int k=0;k<r;k++) {
for(int l=0;l<c;l++) {
	System.out.print(z[k][l]+" ");
}
System.out.println();
}
}
}
