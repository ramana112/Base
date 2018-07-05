//writing the data from keyboard as string(bytes) to file (using getBytes() method)import java.io.*;
import java.io.*;
public class Pgm2 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fout = new FileOutputStream("E:\\Doc.txt");
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	System.out.println("plz enter the data");
	String s = br.readLine();
	byte b[] = s.getBytes();
	fout.write(b);
	
	br.close();
	fout.close();
	}

}
