import java.util.Scanner;
public class TernaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter any two numbers to check maximum number ");
int n1=sc.nextInt();
int n2=sc.nextInt();
String max_value=(n1>n2)?n1+ " is maximum value":n2+ " is maximum value";
System.out.println(max_value);
	}

}
