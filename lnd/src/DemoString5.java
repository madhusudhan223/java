
import java.util.Scanner;
public class DemoString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
	    String s=sc.nextLine();
	    char ch1[]=s.toCharArray();
	   for(int i=0;i<=ch1.length-1;i++) {
	
	int n=s.indexOf(ch1[i]);
	System.out.println("  index of "+ch1[i]+" is "+n);
}
	}

}
