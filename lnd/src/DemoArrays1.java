import java.util.Iterator;
import java.util.Scanner;
public class DemoArrays1 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number of Strings");
int n=sc.nextInt();
String s[]=new String[n];
System.out.println("enter group of Strings");
for (int i = 0; i < s.length; i++) {
	 s[i]=sc.next();
}
for(int i=97;i<123;i++) {
	for(int j=0;j<s.length;j++) {
		int ch=s[j].charAt(0);
		if(ch==i) {
				System.out.println(s[j]);
			}	
		}
	}
}
}
