import java.lang.String;
import java.util.Scanner;
public class DemoString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a string to be reversed");
 String s=sc.nextLine();
 for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
 }
 
	}

}
