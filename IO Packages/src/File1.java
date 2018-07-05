import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the file name");
		String fname=br.readLine();
		File f = new File(fname);
		System.out.println("File name: "+f.getName());
		System.out.println("absolute path: "+ f.getAbsolutePath());
		System.out.println("file path: "+ f.getPath());
		System.out.println("parents: "+ f.getParent());
		System.out.println("Exists: "+f.exists());
		if(f.exists())
		{
			System.out.println("is writable: "+f.canWrite());
			System.out.println("is readable: "+f.canRead());
			System.out.println("is adirector: "+f.isDirectory());
			System.out.println("file size in bytes: "+f.length());
			System.out.println("is file: "+f.isFile());
			
		}
		else System.out.println("not exist");
	}

}
