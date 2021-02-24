import java.io.*;
public class DemoFiles1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("dummy.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int ch;
		while((ch=bin.read())!=-1) {
			System.out.print((char)ch);
		}
		bin.close();
		System.out.println("end of program");
	}

}
