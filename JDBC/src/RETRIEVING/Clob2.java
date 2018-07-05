package RETRIEVING;
import java.io.*;
import java.sql.*;

public class Clob2 {

	public static void main(String[] args) throws Exception 
	{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Myclob");
		rs.next( );
		Clob c = rs.getClob(1);
		System.out.println("file size = "+c.length());
		Reader r =c.getCharacterStream();
		int ch;
		FileWriter fw = new FileWriter("E:\\Dox.txt");
		while((ch=r.read())!=-1)
			fw.write((char)ch);
		fw.close();
		con.close();
		
	}

}
