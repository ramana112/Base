import java.sql.*;

public class Pgm1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{System.out.println("hai");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
	DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
	Statement stmt = con.createStatement();
	System.out.println("connected");
	String sql = "select * from college33";
	int i = stmt.executeUpdate("insert into college33 values(222, 'fff', 'rttt')");
	System.out.println("no of rows effected :"+i);
	ResultSet rs=stmt.executeQuery(sql);
	//System.out.println("ramana");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		System.out.println();
		System.out.println();
		System.out.println("=============");
	}
	con.close();
	}

}
