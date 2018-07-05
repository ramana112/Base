import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Performfetch1 {

	public static void main(String[] args) throws Exception
	{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		Statement stmt = con.createStatement();
		stmt.setFetchSize(1);
		long t1 = System.currentTimeMillis();
		ResultSet rs = stmt.executeQuery("select * from Clg1");
		while(rs.next())
			System.out.println(rs.getInt(1)+" |"+rs.getInt(2));
		long t2 = System.currentTimeMillis();
		System.out.println("time: "+(t2-t1));
		con.close();
	}

}
