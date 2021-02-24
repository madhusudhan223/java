import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Insertjdbc {
 public static void main(String[] args) throws SQLException {
	 Scanner sc=new Scanner(System.in);
	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	Statement stmt= con.createStatement();
	
	System.out.println("enter details to insert");
	System.out.println("enter roll no");
	int n=sc.nextInt();
	System.out.println("enter name ");
	String s=sc.next();
	System.out.println("enter age");
	int n1=sc.nextInt();
	System.out.println("enter marks");
	int n2=sc.nextInt();
	System.out.println("enter div");
	String s1=sc.next();
	System.out.println("enter email");
	String s2=sc.next();
	
String sql="insert into student values("+n+",'"+s+"',"+n1+","+n2+",'"+s1+"','"+s2+"')";
//System.out.println(sql);
	int rowCount= stmt.executeUpdate(sql);	
	
	System.out.println("no.of rows updated "+rowCount);
		con.close();
}
}
