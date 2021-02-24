
public class Demopolymor {
public static void main(String[] args) {
	
	
B1 b=new B1();


b.m(2,3);
	
}
}
class A1{
	int i=30;
	  void m1(int a,int b) {
		System.out.println(a+b);
	}
	void m(byte i,byte j) {
		System.out.println(i-j);
}
}
class B1 extends A1{

	 void m(int a,int b) {
		System.out.println(a);
		
	}
	 void m(int a) {
		 System.out.println(a*a);
	 }
}

	

	
