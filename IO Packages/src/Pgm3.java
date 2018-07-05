//writing the data to file using bufferedOutputstream;
import java.io.*;
public class Pgm3 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fout = new FileOutputStream("E:\\Demo1.txt");
	BufferedOutputStream bout = new BufferedOutputStream(fout); 
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	System.out.println("plz enter the data");
	char ch;
	while((ch=(char)br.read())!='$')
	{
		bout.write(ch);
		bout.flush();
	}
		
	}

}
