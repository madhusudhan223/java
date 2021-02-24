
public class DemoInnerClass1 {
public static void main(String[] args) {
	
	stu b=new stu("madhu",25,223,55);
	b.show();
}
}
class an{
	String name;
	int age;
//	public an(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
/*void dis() {
	System.out.println(name);
	System.out.println(age);
}*/

}
class stu extends an{
	int id;
	int marks;
	public stu(String s,int a,int id, int marks) {
		name=s;
		age=a;
		this.id = id;
		this.marks = marks;
	}
	void show() {
		
		System.out.println(id);
		System.out.println(marks);
		System.out.println(name);
		System.out.println(age);
	}
}