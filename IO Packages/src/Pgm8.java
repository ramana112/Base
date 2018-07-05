//from file to file
import java.io.*;
public class Pgm8 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s1 = br.readLine();
	FileInputStream fin = new FileInputStream(s1);
	String s2 = br.readLine();
	FileOutputStream fout = new FileOutputStream(s2);
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	System.out.println("plz enter the data");
	int x;
	while((x=fin.read())!=-1)
	{
		fout.write((char) x);
	}
			
	}

}
