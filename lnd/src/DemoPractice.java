import java.util.Scanner;
class DemoPractice{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Search h=new Search("hari","222","9704011913");
	Search g=new Search("madhu","223","9640493113");
	Search s1=new Search("srikanth","123","9573450332");
	System.out.println("enter name or id phone number to search");
	String s=sc.next();
	if(s.equalsIgnoreCase(h.name)||s.equalsIgnoreCase(h.id)||s.equalsIgnoreCase(h.phone)) {
		h.display();
	}
	else if(s.equalsIgnoreCase(g.name)||s.equalsIgnoreCase(g.id)||s.equalsIgnoreCase(g.phone)) {
		g.display();
	}
	else if(s.equalsIgnoreCase(s1.name)||s.equalsIgnoreCase(s1.id)||s.equalsIgnoreCase(s1.phone)) {
		s1.display();
	}
	else {
		System.out.println("details not found");
	}
		}
	}
class Search{
	 String name;
	 String id ;
	 String phone;
	Search(String name, String id,String  phone){
		this.name=name;
		this.id=id;
		this.phone=phone;
	}
	void display() {
		System.out.println("Employee name : "+ name);
		System.out.println("Employee Id : "+id);
		System.out.println("Employee phone no.: "+phone);
	}
}

	
