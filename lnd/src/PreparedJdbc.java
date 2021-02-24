


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PreparedJdbc {
public static void main(String[] args) throws SQLException {
Scanner sc=new Scanner(System.in);
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
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
	String s3="insert into student values(?,?,?,?,?,?)";
	PreparedStatement stmt= con.prepareStatement(s3);
	stmt.setInt(1, n);
	stmt.setString(2, s);
	stmt.setInt(3, n1);
	stmt.setInt(4, n2);
	stmt.setString(5, s1);
	stmt.setString(6, s2);
	 int row =stmt.executeUpdate();		
	System.out.println("no.of rows updated :"+row);
		con.close();
}
}


