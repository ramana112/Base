//to view data in any file or read the data in any file
import java.io.*;
public class Pgm7 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter file file to read: ");
	String s = br.readLine();
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	FileInputStream fin = new FileInputStream(s);
	//System.out.println("plz enter enter file name: ");
	BufferedInputStream bin = new BufferedInputStream(fin); 
	System.out.println("file contents: ");
	int x;
	while((x=bin.read())!=-1)
		System.out.print((char)x);
		bin.close();
		
	
	}

}
