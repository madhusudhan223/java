import java.io.Serializable;

public class Demoo implements Serializable{
	  String name;
	Demoo(String name){
		this.name=name;
	}
	void display() {
		System.out.println(name);
	}
}