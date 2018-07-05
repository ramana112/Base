package FileWriter;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Filew {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("E:\\Doc.txt");
		char ch;
		while((ch=(char)br.read())!='$')
		{
			fw.write(ch);
		}
		fw.close();
		br.close();
	}

}
