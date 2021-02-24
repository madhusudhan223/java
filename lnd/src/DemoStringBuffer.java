
public class DemoStringBuffer {
public static void main(String[] args) {
	String s="welcome";
	StringBuffer sb=new StringBuffer(s);
    sb.append("tojava");   
    System.out.println(sb.toString());
    sb.delete(7, 9);
    System.out.println(sb.toString());
    sb.insert(7, "madhu");
    System.out.println(sb.toString());
    sb.reverse();
    System.out.println(sb.toString());
    
}
}
