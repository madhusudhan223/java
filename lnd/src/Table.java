import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter which table to be displayed ");
	int n=sc.nextInt();
	int table;
	for(int i=1;i<=10;i++) {
	  table=n*i;
		System.out.println(n+" * "+i+" "+"="+table);
	}
	}
	

}
