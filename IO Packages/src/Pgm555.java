import java.io.*;
import java.util.zip.*;
public class Pgm555 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\Demo4.txt");
		InflaterInputStream in = new InflaterInputStream(fis);
		int x;
		while((x=in.read())!=-1)
		
			System.out.println((char)x);
		
		
		
	}

}
