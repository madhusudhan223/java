
class StaticDynamicBinding  {
public static void main(String[] args) {
	S1 s=new S1();
	s.m();
	
	
			
}
}
class S{
	 void m() {
	System.out.println("i m demo");	
	}
}
class S1 extends S{
	 void m() {
		System.out.println("i m demo1");
	}
}