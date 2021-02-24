
public class Demointerface {
	public static void main(String[] args) {
		Ifour i=new Ifour();
		i.m3();
		i.m();
		i.m1();
	System.out.println(i.x);
}
}
interface Ione{
	int x=90;
	void m();
	void m1() ;	
	
}
interface Itwo  {
	@override
 public void m3(); 
}
 abstract class Ithree implements Itwo,Ione{
   
	@Override
	public void m() {
		System.out.println("223");
	}		
 public void m1() {
	System.out.println("sudhan");
	}
}
 class Ifour extends Ithree{
	 public void m3() {
		 System.out.println("raj");
	 }
 }
	