
public class DemoAbstract {
public static void main(String[] args) {
	DemoThree n=new DemoThree();
	n.m("madhu");
	n.m1();
	DemoTwo e=new DemoTwo();
	e.m("raj");
	e.m1();
}
}
abstract class DemoOne{
	abstract void m(String name);
	void m1() {
		System.out.println("i m in m1");
	}
}
class DemoTwo extends DemoOne{
	@override
	void m(String name) {
		System.out.println("i am demotwo m");
	}
}
class DemoThree extends DemoOne{
	@override
void m(String name) {
		System.out.println("i am demothree m");
	}
}