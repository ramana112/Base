import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class File2 {

	public static void main(String[] args) throws IOException,NullPointerException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the file name");
		String fname = br.readLine();
		File f = new File(fname);
		if(f.exists())
		{
			String arr[] = f.list();
			int n = arr.length;
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
				File f1 = new File(arr[i]);
				if(f1.isFile())
					System.out.println(": is a file");
				if(f1.isDirectory())
					System.out.println(":is directory");
			}
		
		//System.out.println(" no entries of this directory");
		}
		else
			System.out.println("directory doesnot exist");
	}

}
