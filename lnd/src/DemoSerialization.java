import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoSerialization {
public static void main(String[] args) throws IOException {
	Demoo obj=new Demoo("madhu");
	FileOutputStream fout=new FileOutputStream("dummy5.txt");
	BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
	ObjectOutputStream oo=new ObjectOutputStream(bout);
	oo.writeObject(obj);
	oo.close();
	fout.close();
	bout.close();
	
	System.out.println("serialization complete");
	
}
}
