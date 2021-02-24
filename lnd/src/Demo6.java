import java.util.Scanner;
public class Demo6 {
public static void main(String[] args) {
String userId="madhusudhan";
String passWord="madhu123";
Scanner sc=new Scanner(System.in);
String s,s1;
do {
	System.out.println("enter userid");
	 s=sc.next();
	System.out.println("enter password");
	 s1=sc.next();
	if(!(s.equals(userId)&& s1.equals(passWord))) {
		System.out.println("entered details are wrong please enter again");	}
	else {
		System.out.println("login Successfull");
	}
}while(!(s.equals(userId)&& s1.equals(passWord)));
}
}
