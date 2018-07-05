package Serial;
import java.io.*;
public class Deserial {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("E:\\Demo8.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Student s = (Student)ois.readObject();
		s.disp();

	}

}
