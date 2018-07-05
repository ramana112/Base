package Serial;
import java.io.*;
public class Serial11 {

	public static void main(String[] args) throws Exception
	{
	Student s = new Student();
	
	s.setName("ram");
	s.setAddr("nellore");
	s.getName();
	s.getAddr();
	//s.disp();
	FileOutputStream fout=new FileOutputStream("E:\\Demo8.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fout);
	oos.writeObject(s);
	
	}
	}
class Student implements Serializable  // implements Serializable
{
	String name;
	String addr;
	
	public void setName(String name)
	{
		this.name=name;  
	}
	public void setAddr(String addr)
	{	this.addr=addr;
	}
	public String getName()
	{
		return name;
	}
	public String getAddr()
	{
		return addr;
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(addr);
	}
}
