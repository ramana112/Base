import java.sql.*;
public class Performdriv {

	public static void main(String[] args) throws Exception
	{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		Statement stmt = con.createStatement();
		long t1 = System.currentTimeMillis();
		for(int i=1;i<1000;i++)
		stmt.executeUpdate("insert into Clg1 values("+i+","+i+")");
		long t2 = System.currentTimeMillis();
		System.out.println("time: "+(t2-t1));
		con.close();
	}

}
