//to view data in particular file or read the data in a particular file
import java.io.*;
public class Pgm6 {

	public static void main(String[] args) throws IOException
	{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileInputStream fin = new FileInputStream("E:\\Demo1.txt");
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	System.out.println("file in Demo1 is: ");
	int x;
	while((x=fin.read())!=-1)
	System.out.print((char)x);
	fin.close();
	
	}

}
