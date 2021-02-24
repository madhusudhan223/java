
public class Demop {
public static void main(String[] args) {
One o=new One();

try {
	o.m1();
} catch (Two e) {
System.out.println(e.getMessage());
	
}
o.m();
}	
}
class One{
	void m1() throws Two{
		Two t1=new Two("second exception");
		throw t1;
	}
	 void m() {
		Two t=new Two("s");
		try {
			t.m();
		} catch (Three e) {
			System.out.println(e.getMessage());
		}
	}
	
}
class Two extends Exception {
	Two(String name){
		super(name);
	}
	void m()throws Three{
	Three t=new Three("third exception");
	throw t;
}
	
}
class Three extends Exception{
 Three(String name){
	 super(name);
 }
 
}
