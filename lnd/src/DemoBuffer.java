import java.io.*;
public class DemoBuffer {
public static void main(String args[])throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr); 
System.out.println("enter your basic salary");
String salary=br.readLine();
int n1=Integer.parseInt(salary);
System.out.println("enter hra percentage");
String hra=br.readLine();
int a=Integer.parseInt(hra);
System.out.println("enter da percentage");
String da=br.readLine();
int b=Integer.parseInt(hra);
System.out.println("enter pf percentage");
String pf=br.readLine();
int c=Integer.parseInt(pf);
int netSalary=n1+((a*n1)/100)+((b*n1)/100)-((c*n1)/100);
System.out.println("your net salary is : "+netSalary);
if(netSalary<50000) {	
	System.out.println("you are not eligible for marriage, you have to work hard");
}
else {
	System.out.println("you are eligible for marriage");
}
}
}
