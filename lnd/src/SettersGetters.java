
public class SettersGetters {
public static void main(String[] args) {
	Student s=new Student();
	s.setName("madhu");
	s.setId(223);
	System.out.println(s.getName());
	System.out.println(s.getId());
}
}
class Student{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public void display() {
		System.out.println(getId());
		System.out.println(getName());
	}*/
}