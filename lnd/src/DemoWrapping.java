
public class DemoWrapping {
public static void main(String[] args) {
	
   Integer ii=new Integer(10);
	int i=ii.intValue();
	char ch='a';
	Character c=new Character(ch);
	int i3=c;
	System.out.println(i3);
	char ch1=c.valueOf(ch);
	int i2=c.valueOf(ch1);
	System.out.println(ch+" "+i2);
	
	
}

}
