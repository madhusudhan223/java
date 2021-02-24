
public class DemoObjNum {
public static void main(String[] args) {
	ObjNum a= new ObjNum("madhu");
	ObjNum b= new ObjNum();
	ObjNum c= new ObjNum();
	System.out.println("number of objects created "+b.i);
	
}
}
class ObjNum{
	static int i=0;
	public ObjNum(){
		i++;
	}
	public ObjNum(String s){
		i++;
	}
	
}
