
public class HasaRelation {
public static void main(String[] args) {
	
	C c=new C();
	B b=new B();
	A a=new A(50,b,c);
	a.show();
	
}
}
class A{
	int x;
	B b;
	C c;
	A( int x,B b,C c){
		this.b=b;
	    this.c=c;
	    this.x=x;
	}
	void show() {
		System.out.println(this.x+" "+b.y+" "+c.s);
		b.met();
	}
}
class B{
	int y=60;
	void met() {
		System.out.println("hello");
	}
}
class C{
	String s="madhu";
}