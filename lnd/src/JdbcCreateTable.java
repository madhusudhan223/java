import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcCreateTable {
public static void main(String[] args) throws SQLException {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
	Statement stmt= con.createStatement();
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to login");
	System.out.println("enter username");
	String s=sc.next();
	System.out.println("enter password");
	String s1=sc.next();
	String sql="(select password from login where username = '"+s+"')";
	ResultSet rs= stmt.executeQuery(sql);	
	int count=0;
		while(rs.next()) {
			 String pwd=rs.getString(1);
			 count++;
			 if (pwd.equals(s1)) {
				System.out.println("login success");
			}
			else {
				System.out.println("entered password is wrong ");
			}
			}
	if (count==0) {
		System.out.println("username not found");
	}	
con.close();
}
}
