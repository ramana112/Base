//deflater: writing data to file and making in zip format
import java.io.*;
import java.util.zip.*;
public class Pgm5 {

	public static void main(String[] args) throws Exception
	{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileInputStream fin = new FileInputStream("E:\\Demo.txt");
	FileOutputStream fout = new FileOutputStream("E:\\Demo6.txt");
	DeflaterOutputStream df = new DeflaterOutputStream(fout);
	//BufferedOutputStream bout = new BufferedOutputStream(fout); 
	//FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
	//System.out.println("plz enter the data");
	
	int x;
	while((x=fin.read())!=-1)
	{
		df.write(x);
		//df.flush();
	}
		fout.close();
		df.close();
	}

}
