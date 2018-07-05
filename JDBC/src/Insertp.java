import java.sql.*;

public class Insertp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
	//DriverManager.registerDriver(new Oracle.jdbc.driver.OracleDriver());	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
	Statement stmt = con.createStatement();
	//String sql = "Select * from College";
	int n= stmt.executeUpdate("create table ramana(id number, fname varchar(50), addr varchar(50))");
	int norows = stmt.executeUpdate("insert into ramana(fname) values('ramana')");
	System.out.println("effected rows: "+ norows);
	norows = stmt.executeUpdate("insert into ramana values(222, 'raj','kkk')");
	System.out.println("effected rows: "+norows);
	String sql = "Select * from ramana";
	ResultSet rs=stmt.executeQuery(sql);
	//System.out.println("ramana");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		/*System.out.println();
		System.out.println();*/
		System.out.println("=============");
	}

	con.close();
	}

}
