import java.io.*;
public class DemoFiles {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fout=new FileOutputStream("E:\\dummy");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	System.out.println("please enter ....@toexit");
	char ch;
	while((ch=(char)br.read())!='@'){
		
		bout.write(ch);
	}
	bout.close();
	System.out.println("end of the program");
}
}
