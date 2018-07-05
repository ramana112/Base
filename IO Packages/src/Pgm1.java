//writing the data from keyboard as character to file (using write method)
import java.io.*;
public class Pgm1 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fout = new FileOutputStream("E:\\Demo.txt");
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	System.out.println("plz enter the data");
	char ch;
	while((ch=(char)br.read())!='$')
	{
		fout.write(ch);
	}
		br.close();
		fout.close();
	
	}

}
