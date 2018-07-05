/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Performdriv1 {

	public static void main(String[] args) throws Exception
	{
		DriverManager.registerDriver (new sun. jdbc.odbc.jdbcOdbcDriver());
		Connection con = DriverManager.getConnection("new sun.jdbc.odbc.jdbcodbcDriver","system", "1245");
		Statement stmt = con.createStatement();
		long t1 = System.currentTimeMillis();
		for(int i=1;i<1000;i++)
		stmt.executeUpdate("insert into Clg1 values("+i+","+i+")");
		long t2 = System.currentTimeMillis();
		System.out.println("time: "+(t2-t1));
		con.close();
	}

}
*/