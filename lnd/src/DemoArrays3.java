import java.util.Scanner;

public class DemoArrays3 {

	public static void main(String[] args) {
		String temp="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of Strings");
		int n=sc.nextInt();
		String s[]=new String[n];
		System.out.println("enter group of Strings");
		for (int i = 0; i < s.length; i++) {
			 s[i]=sc.next();
		}
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
	}
		System.out.println("sorted elements into alaphabetical order:");
			for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

}
}