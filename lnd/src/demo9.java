import java.util.Scanner;
public class demo9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string to check how many ways can be arranged");
	String s=sc.next();
	int n=s.length();
	int fact=1;
	for(int i=n;i>=1;i--) {
		fact=fact*i;
	}
	System.out.println("the given string can be arranged "+ fact +" ways");
}
}
