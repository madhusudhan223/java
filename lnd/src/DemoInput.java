import java.io.*;
class DemoInput{
public static void main(String args[])throws IOException{
InputStreamReader obj=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(obj);
System.out.println("enter phone number");
String name=br.readLine();
System.out.println("enter character");
int x=br.read();
System.out.println("enter name1");
String name1=br.readLine();
System.out.println("phone number: "+name);

System.out.println(x);
System.out.println(name1);
}
}
