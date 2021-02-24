
public class DemoObject {
	
		public static void main(String[] args)throws Throwable {
//			E e=new E();
//			display(e);
//			display(new DemoTwo());
//			method();
			Person1 p=new Person1("madhu",123,3);
			Person1 p1=new Person1("madhu",123,3);
//		  Person1 p2= p.clone();
//		  System.out.println(" duplicate "+p2);
//		  method();
		  p.finalize();
		  p1.finalize();
		  p=null;
		  p1=null;
		  System.gc();
		  //display(p);
//			if(p.equals(p1)) {
//				System.out.println("same");
//			}
//			else {
//				System.out.println("not same");
//			}
	}

		static void display(Object o) {
			Class c=o.getClass();
			String name=c.getName();
			System.out.println(name);
			
		}

		static void method() {
			Person1 p=new Person1("madhu",123,220);
			System.out.println(p.toString());
		}
}
		
		class Person1 implements Cloneable{
		 String name;
		 int i;
		 int j;
		 Person1(String name,int i,int j){
		 this.name=name;
		 this.i=i;
		 this.j=j;
		}
		 
		  @override
		 public  String toString() {
			 return "[person name="+name+", person id= "+ i +"]";
		 }
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person1 other = (Person1) obj;
			if (i != other.i)
				return false;
			if (j != other.j)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@override
		protected Person1 clone() throws CloneNotSupportedException {
			
			return (Person1) super.clone();
		}
		@override
		protected void finalize ()throws Throwable{
			System.out.println("clean up logic goes here");
		}
		}

		  


