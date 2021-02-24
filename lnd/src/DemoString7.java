import java.util.Scanner;
public class DemoString7 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	System.out.println("enter character to be removed");
	char ch =sc.next().charAt(0);
	char ch1[]=s.toCharArray();
	for(int i=0;i<=ch1.length-1;i++) {
		if(ch1[i]!=ch) {
			System.out.print(ch1[i]);
		}
	}
		
}
}
