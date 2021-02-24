import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the range of prime numbers to be printed");
int n1=sc.nextInt();
int n2=sc.nextInt();
for(int i=n1;i<=n2;i++) {
	int count=0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println(i);
	}
}
	}

}
