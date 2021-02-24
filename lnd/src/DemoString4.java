import java.lang.String;
import java.util.Scanner;
public class DemoString4 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string which contain special character");
 String s=sc.nextLine();
 for(int i=0;i<=s.length()-1;i++) {
	 char ch=s.charAt(i);
	 if(ch>31 && ch<=47 || ch>57 && ch<=64 || ch>90 && ch<=96 || ch>122 && ch<=126) {
		 System.out.print(ch);
	 }
 }
}
}
