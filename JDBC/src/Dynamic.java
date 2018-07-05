import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException
	{
	//DriverManager.registerDriver(new Oracle.jdbc.driver.OracleDriver());	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
	Statement stmt = con.createStatement();
	int c = stmt.executeUpdate("create table klkl(id number, name varchar(50), addr varchar(50))");
	Scanner s = new Scanner(System.in);
	System.out.println("plz enter how many records to enter:");
	int n = s.nextInt();   
	int i=1;
	while(i<=n)
	{
		int id = s.nextInt();
		String name = s.next();
		String addr = s.next();
		int in = stmt.executeUpdate("insert into klkl values("+id+",'"+name+"','"+addr+"')");
		i++;
	}
	ResultSet rs = stmt.executeQuery("select * from klkl");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
	}
	con.close();
	}
}