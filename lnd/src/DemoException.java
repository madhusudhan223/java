
public class DemoException {
public static void main(String[] args) {
	int res = 0;
	boolean t=true;
try {
	int i=20/0;
	String name=null;
	Emp emp=null;
	
	System.out.println(name.toString());
	System.out.println(emp.toString());
}
catch(ArithmeticException e){
	System.out.println("Oops something went wrong");
	t=false;
}
finally {
	if(t) {
		System.out.println(res);
	}
	else {
		System.out.println("please try again");
	}
}

}
}

