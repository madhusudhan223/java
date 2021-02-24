import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]=new int[3];
	System.out.println("enter b seats :");
        n[0]=sc.nextInt();
        System.out.println("enter y seats :");
        n[1]=sc.nextInt();
        System.out.println("enter t seats");
        n[2]=sc.nextInt();
        int max=n[0];
        for(int i=0;i<3;i++) {
        	if(n[i]>max)
        		max=n[i];
        }
        if(max==n[0]) {
        	System.out.println("b won");
        }
        else if(max==n[1]) {
        	System.out.println("y won");
        }
        else if(max==n[2]) {
        	System.out.println("t won");
        }
	}

}
