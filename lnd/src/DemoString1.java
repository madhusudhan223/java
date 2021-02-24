import java.lang.String;
import java.util.Scanner;
public class DemoString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		System.out.println("enter first character of word to be checked");
		String s1=sc.next();
		
		int count=0;
		String[] names=s.split(" ");
		for(int i=0;i<=names.length-1;i++) {
		
			if(names[i].startsWith(s1)) {
				count++;
			}
			
		}
		System.out.println("your word is repeated " +  count +" times ");
		

	}

}
