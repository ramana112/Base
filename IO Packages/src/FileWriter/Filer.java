package FileWriter;
import java.io.*;

public class Filer {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//FileReader fr = new FileReader("E:\\Doc.txt");
		FileWriter fw = new FileWriter("E:\\Doc2.txt");
		String str;// = "my name is ramana";
		while(!(str=br.readLine()).equals("exit"))
		{
			fw.write(str+"\n");
		}
		fw.close();
		br.close();
	}

}
