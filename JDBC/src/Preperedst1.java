import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Preperedst1 {

	public static void main(String[] args) throws Exception
	{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		PreparedStatement stmt = con.prepareStatement("insert into Clg3 values(?,?)");
		long t1 = System.currentTimeMillis();
		
		for(int i=1;i<1000;i++)
		{
			stmt.setInt(1, i);
			stmt.setInt(2, i);
			stmt.executeUpdate();
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println("time: "+(t2-t1));
		con.close();
	}

}
