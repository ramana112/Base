import java.io.*;
import java.sql.*;

public class Update1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException
	{
	//DriverManager.registerDriver(new Oracle.jdbc.driver.OracleDriver());	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
	Statement stmt = con.createStatement();
	int norows = stmt.executeUpdate("update College set fname='king' where lname='kkk' ");
	System.out.println("effected rows: "+ norows);
	System.out.println("press a key to continue...");
	//System.in.read();
	norows = stmt.executeUpdate("delete College where fname='ramana' ");
	//norows = stmt.executeUpdate("truncate table College");
	System.out.println("effected rows: "+norows);
	
	con.close();
	}

}
