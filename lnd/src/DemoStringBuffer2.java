import java.util.Scanner;

public class DemoStringBuffer2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many subjects");
	int n=sc.nextInt();
	int n1[]=new int[n];
	System.out.println("please enter your marks");
	float count=0;
	for(int i=0;i<n1.length;i++) {
		n1[i]=sc.nextInt();
		count=count+n1[i];
	}
	System.out.println("total marks : "+count);
	float per=((count*100)/(n*100));
	System.out.println("your percentage is : "+per);
	if (per>=70&&per<=100){
		 System.out.println("A GRADE");
		 }
		else if(per<70&&per>=60){
		  System.out.println("B GRADE");
		}
		else if(per<60&&per>=50){
		 System.out.println("c GRADE");
		}
		else if(per<50&&per>=35){
		  System.out.println("D GRADE");
		}
		else{ 
		 System.out.println("you are failed");
}
}
}