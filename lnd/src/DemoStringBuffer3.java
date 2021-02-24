import java.util.Scanner;

public class DemoStringBuffer3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of array of Strings");
		int n=sc.nextInt();
		String s[]=new String[n];
		System.out.println("enter array of Strings");
		boolean found=false;
		int count=0;
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
		}
		System.out.println("enter word to search");
String s1=sc.next();
for(int i=0;i<s.length;i++) {
	if(s[i].equalsIgnoreCase(s1)) {
		System.out.println("found at position :"+(i+1));
		found=true;
		count++;
	}
}

	if(found==false) {
		System.out.println("not found");

}
	else {
		System.out.println("word is repeated : "+count+" times");
	}
	}

}
