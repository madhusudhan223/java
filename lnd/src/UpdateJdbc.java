

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class UpdateJdbc {
public static void main(String[] args) throws SQLException {

	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
	Statement stmt= con.createStatement();	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age to update");
	int i=sc.nextInt();
	System.out.println("enter id ");
	int n=sc.nextInt();
String sql="update student set age='"+i+"' where rollno ="+n;
String sql1="delete from student where rollno="+n;

//System.out.println(sql);
stmt.executeUpdate(sql);	
	
	//System.out.println("no.of rows updated "+rowCount);
		con.close();
}
}

