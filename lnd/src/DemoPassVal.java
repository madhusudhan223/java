
public class DemoPassVal {
public static void main(String[] args) {
	int x=10;
	int y=20;
	Change a=new Change();
	a.doSwap(x,y);
	System.out.println("pass by value output :"+x+" "+y);
	ma e1=new ma(10);
	ma e2=new ma(20);
	a.doSwap(e1, e2);
	System.out.println("pass by ref output :"+e1.id+" "+e2.id);
	/*new Change().doSwap(e1, e2);
	System.out.println(e1.id+" "+e2.id);*/
}
}
class ma{
	int id;

	public ma(int id) {
		
		this.id = id;
	}
}
class Change{
	/*int id;
	public Change(){
		
	}*/
	/*public Change(int id) {                                                                                                                                           
		this.id=id;
	}*/
	void doSwap(int x,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	
	void doSwap(ma e1,ma e2 ) {
		int temp;
		temp=e1.id;
		e1.id=e2.id;
		e2.id=temp;
	}
}
