
public class DemoInheritance {
public static void main(String[] args) {
	E e=new E();
	e.m_show();
	F f=new F();
	f.m();
	
}
}
class D{
	 int i;
	 String s;
	D(String s,int i){
	this.i=i;
		this.s=s;
	}
	

void m_show(){
	System.out.println(s+" "+"k");
}

}
class E extends D{
	 int n=40;
	E(){
		super("anand",440);
	}
	void m_show(){
		System.out.println(super.i);
		super.m_show();
	}
	
}
class F extends D{
F(){
super("madhu",223);
	}
void m() {
	System.out.println(super.i);
	super.m_show();
}
}