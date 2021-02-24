import java.io.Console;
public class DemoConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Console con=System.console();
System.out.println("please enter name");
String name=con.readLine();
System.out.println("enter password");
char[] ch=con.readPassword();
System.out.println("name : "+name);
System.out.println("password "+ch);

	}

}
