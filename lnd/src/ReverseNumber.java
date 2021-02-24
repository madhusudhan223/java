import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be reversed");
		int n=sc.nextInt();
		int org=n,rev=0,rem;
		for(;org!=0;) {
			rem=org%10;
			rev=rev*10+rem;
			org=org/10;
		}
		System.out.println("reverse of a given number is :" + rev);
	}

}
