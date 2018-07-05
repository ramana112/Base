import java.io.*;
public class Counting {

	public static void main(String[] args) throws IOException
	{
		
		int ch;
		boolean prev=false;
		int char_count=0;
		int word_count=0;
		int line_count=0;
		FileInputStream fin = new FileInputStream("E:\\Demo.txt");
		while((ch=fin.read())!=-1)
		{
			if(ch!=' ') ++char_count;
			if(!prev&&ch == ' ') ++word_count;
			if(ch == '\n') ++line_count;
		}
		char_count -=line_count*2;
		word_count += line_count;
		System.out.println("no of chars: "+ char_count);
		System.out.println("no of words: "+ word_count);
		System.out.println("no of lines: "+ line_count);
		fin.close();
	
	}

}
