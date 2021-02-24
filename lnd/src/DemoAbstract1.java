                                                                                                              
public class DemoAbstract1 {
public static void main(String[] args) {
	I20 i=new I20(2456,4);
	i.steering_type();
	i.braking_system();
	i.fuelTank();
	i.display();
}
}
abstract class Car{
	int regno;
	int wheels;
	Car (int regno,int wheels){
		this.regno=regno;
		this.wheels=wheels;
	}
	void fuelTank() {
		System.out.println("fuel tank");
	}
	
	abstract void steering_type();
	abstract void braking_system();
}
class I20 extends Car{
	public I20(int regno,int wheels) {
		super(regno,wheels);
	}
		@override
		void steering_type() {
			System.out.println("power steering");
		}
		@override
		void braking_system() {
			System.out.println("abs");
		}
		void display() {
			System.out.println(regno);
			System.out.println(wheels);
		}
	}
	
class Alto extends Car{
	public Alto(int regno,int wheel) {
		super(regno,wheel);
	}
	@override
	void steering_type() {
		System.out.println("manual steering");
	}
	void braking_system() {
		System.out.println("normal braking");
		
	}
}