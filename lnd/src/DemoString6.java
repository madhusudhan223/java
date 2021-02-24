import java.util.Scanner;
public class DemoString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to find duplicate words");
		String s=sc.nextLine();
		String[] names=s.split(" ");
		
		for(int i=0;i<=names.length-1;i++) {
		int count=0;
			for(int j=i+1;j<=names.length-1;j++) {
			if(names[i].equals(names[j])){
				count++;
				names[j]="x";
				
			}
			}
			if(count>=1 && names[i]!="x") {
				System.out.println(names[i]);
			}
		
			}	
		}
		}
		


	







































































































