import java.lang.String;
import java.util.Scanner;
public class DemoString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter a string to check whether it is palindrome or not");
		 String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s); 
		sb.reverse();
		String s1=sb.toString();
		if(s.equals(s1)) {
			 System.out.println("given String is palindrome");
		 }
		 else {
			 System.out.println("given string is not palindrome");
		 }
		
		
		
		
		 
		
		
		
	}

}


