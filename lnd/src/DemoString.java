
import java.util.Scanner;
class DemoString{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter any string");
String s=sc.nextLine();
System.out.println("enter a character to check how many times it is repeated ");
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<=s.length()-1;i++){
if(ch==s.charAt(i)) {
	count++;
}
}
if (count>=1) {
	System.out.print(ch + " is repeated "+count+" times");
}

}
}

	


