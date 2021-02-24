import java.util.Scanner;
public class stringdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String s=sc.next();
	//int count;
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='0';
			}
		
		}
		if(count>=1&&ch[i]!='0') {
		System.out.println(ch[i]+" repeated "+count +" times");
	}
}
}
}
