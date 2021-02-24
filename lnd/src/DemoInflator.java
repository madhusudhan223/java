import java.io.*;
import java.util.zip.InflaterInputStream;
public class DemoInflator {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("E:\\zipit.txt");
		InflaterInputStream ifin=new InflaterInputStream(fin);
		BufferedInputStream bin=new BufferedInputStream(ifin);
		int ch;
		while((ch=bin.read())!=-1) {
			System.out.print((char)ch);
		}
		ifin.close();
	System.out.println("end of program");
	}
}
                     