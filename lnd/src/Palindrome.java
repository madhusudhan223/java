import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string to check whether it is palindrome");
  String s=sc.nextLine();
  StringBuffer sb=new StringBuffer(s);
  sb.reverse();
 String s2=sb.toString();
  System.out.println(s2);
  /*String s2="";
  for(int i=s.length()-1;i>=0;i--) {
	  s2=s2+s.charAt(i);
  }*/
if (s.equals(s2)) {
	System.out.println("given string is palindrome ");
}
else {
	System.out.println("given String is not palindrome");
}

	}

}
