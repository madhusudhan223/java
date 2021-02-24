import java.util.Scanner;
public class Demo7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two strings to check anagram");
	String s1=sc.next();
	String s2=sc.next();
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	int count=0;
	for(int i=0;i<ch1.length;i++) {
		for(int j=0;j<ch2.length;j++) {
			if(ch1[i]==ch2[j]) {
				count++;
				ch2[j]='0';
			}
		}
	}
	if(count==ch1.length) {
		System.out.println("two Strings are anagram");
	}
	else {
		System.out.println("not anagram");
	}
}
}
