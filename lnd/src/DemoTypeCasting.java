
public class DemoTypeCasting {
public static void main(String[] args) {
Sub s=new Sub();
	Super s1=s;
	s1.m();
	
	Super s2=new Sub();
	Sub s3=(Sub)s2;
	s3.m();
	s3.m1();

}
}
class Super{
	 void m(){
		System.out.println("madhu");
	}
}
class Sub extends Super{
	 void m1() {
		System.out.println("sudhan");
	}
}