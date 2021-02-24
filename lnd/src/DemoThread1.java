public class DemoThread1 {
public static void main(String[] args) {
	Dthread1 obj=new Dthread1();
	Thread t=new Thread(obj);
	t.start();
	t.setName("madhu");
}
}
class Dthread1 implements Runnable{
@override	
	public void run() {
		int a=25;
		int c=30;
		System.out.println(a+c);	
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
	}
}