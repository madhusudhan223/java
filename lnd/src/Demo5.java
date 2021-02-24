import java.util.Scanner;
public class Demo5 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str = new String("This is a String Handling Tutorial");
char[] array = new char[6];
str.getChars(10, 16, array, 0);
System.out.print(array);

}

}
