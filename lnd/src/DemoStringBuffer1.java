import java.util.Scanner;
public class DemoStringBuffer1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements to sort into Ascending order");
		int n=sc.nextInt();
		int n1[]=new int[n];
		System.out.println("please enter your elements");
		int temp=0;
	for(int i=0;i<n1.length;i++) {
		n1[i]=sc.nextInt();
	}
	for(int i=0;i<n1.length;i++) {
		for(int j=i+1;j<n1.length;j++) {
			if(n1[i]>n1[j]) {
				temp=n1[i];
				n1[i]=n1[j];
				n1[j]=temp;
			}
		}
	}
System.out.println("sorted elements");
for(int i=0;i<n1.length;i++) {
	System.out.println(n1[i]);
}
	}

}
