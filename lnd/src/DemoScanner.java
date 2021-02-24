import java.util.Scanner;
public class DemoScanner {
	public static void main(String args[]) {	
Scanner sc=new Scanner(System.in);
System.out.println("enter basic salary");
int salary=sc.nextInt();
System.out.println("enter hra percentage ");
int hra=sc.nextInt();
System.out.println("enter da percentage");
int da=sc.nextInt();
System.out.println("enter pf percentage");
int pf=sc.nextInt();
int netSalary=salary+((hra*salary)/100)+((da*salary)/100)-((pf*salary)/100);
System.out.println("your net salary is : "+netSalary);
if(netSalary<50000) {
	System.out.println("your are not eligible for marriage,you have to workhard for better salary ");
}
else {
	System.out.println("you are eligibe for marriage");
}
}
}

