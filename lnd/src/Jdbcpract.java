import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbcpract {
public static void main(String[] args) throws SQLException {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
	Statement stmt= con.createStatement();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter table name");
	String s=sc.next();
	System.out.println("enter how many columns ");
	int n=sc.nextInt();
	String s1[]=new String[n];
	String s2[]=new String[n];
	for(int i=0;i<n;i++) {
		System.out.println("enter column name");
		s1[i]=sc.next();
		System.out.println("enter column type");
		s2[i]=sc.next();
	}
	String sql="";
	for(int i=0;i<n;i++) {
		sql=sql+s1[i]+" "+s2[i];
		if(i!=n-1) {
			sql=sql+", ";
		}
	}
	String sql1="create table "+s+"("+sql+")";
	System.out.println(sql);
stmt.execute(sql1);
con.close();
}
}
