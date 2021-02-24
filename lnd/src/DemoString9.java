import java.util.*;
public class DemoString9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter any string");
String s=sc.nextLine();
//charAt method
System.out.println(s.charAt(3));
	//startswith
boolean x=s.startsWith("m");
boolean y=s.endsWith("n");
System.out.println(x);
System.out.println(y);
//index of
int n=s.indexOf("s");
int m=s.indexOf("sudhan");
System.out.println(n);
System.out.println(m);
//replace
String s2=s.replace('a','e');
System.out.println(s2);
//substring
String s3=s.substring(5,9);
System.out.println(s3);
//tolowercase
String s4=s.toLowerCase();
System.out.println(s4);
String s5=s.toUpperCase();
System.out.println(s5);
//trim()
String s6=s.trim();
System.out.println(s6);
//concat method
String s7="mad";
String s8="hu";
String s9=s7.concat(s8);
System.out.println(s9);
//split
String names[]=s.split(" ");
System.out.println(Arrays.toString(names));

	}
	

}
