//deflater: writing data to file and making in zip format
import java.io.*;
import java.util.zip.*;
public class Pgm55 {

	public static void main(String[] args) throws IOException
	{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//FileOutputStream fout = new FileOutputStream("E:\\Demo4.txt");
	//DeflaterOutputStream df = new DeflaterOutputStream(fout);
	FileInputStream fin = new FileInputStream("E:\\Demo6.txt");
	//BufferedInputStream bout = new BufferedInputStream(fin);
	FileOutputStream fout=new FileOutputStream("E:\\Demo7.txt");
	InflaterInputStream in = new InflaterInputStream(fin);
	//BufferedOutputStream bout = new BufferedOutputStream(fout); 
	
	//System.out.println("plz enter the data");
	
	int i;
	while((i=in.read())!=-1)
		{fout.write(i);
		System.out.println((char)i);}
		//df.flush();
	fout.close();
	in.close();
	
		
	}

}
