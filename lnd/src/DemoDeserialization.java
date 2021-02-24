import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fin=new FileInputStream("dummy5.txt");
	BufferedInputStream bin=new BufferedInputStream(fin,1024);
 ObjectInputStream oo=new ObjectInputStream(bin);
 Demoo obj=(Demoo)oo.readObject();
 obj.display();
 oo.close();
}
}
