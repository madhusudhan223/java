import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoThread {
public static void main(String[] args) {
	System.out.println("hello");
	Thread t=Thread.currentThread();
	//System.out.println(t.getName());
 Dthread t1=new Dthread("madhu");
 t1.start();
 t1.setPriority(1);
t1.m();
 Dthread3 t2=new Dthread3("sudhan");
 t2.start();
 t2.setPriority(6);
 
 //t2.m();
}
void m4() {
	
}
}
class Dthread extends Thread{
public Dthread(String name){
		super(name);
	}
@override
public void run() {
	try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
		Statement stmt= con.createStatement();		
		String sql="select sum(smarks) from student where rollno>=0 and rollno<=4";
		ResultSet rs= stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1));
		}
	} catch (SQLException e) {
		
	}	
	Thread t=Thread.currentThread();
	System.out.println(t.getName());
	//m();
	
	
}
void  m() {
	System.out.println(Thread.currentThread().getName());
}

}class Dthread3 extends Thread{
	public Dthread3(String name){
	super(name);
}
@override
public void run() {
try {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");		
	Statement stmt= con.createStatement();		
	String sql="select sum(smarks) from student where rollno>=0 and rollno<=4";
	ResultSet rs= stmt.executeQuery(sql);
	while(rs.next()){
		System.out.println(rs.getInt(1));
	}
} catch (SQLException e) {
	
}	
Thread t=Thread.currentThread();
//System.out.println(t.getName());
m();

}
void  m() {
System.out.println(Thread.currentThread().getName());
}

}