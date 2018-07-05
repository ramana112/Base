import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Scroll1{

	public static void main(String[] args) throws Exception
	{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from clg4");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		}
		rs.absolute(1);//rs.first();
		System.out.println("=====first=====");
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		rs.absolute(3);
		System.out.println("====absolute(3)=====");
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		System.out.println("================");
		System.out.println("press enter");
		System.in.read();
		rs.last();
		System.out.println("no of rows= "+rs.getRow());
		System.out.println("press enter");
		System.in.read();
		rs = stmt.executeQuery("select id, name, addr from clg4");
		rs.absolute(3);
		rs.updateInt(1, 666);
		rs.updateString(2, "mahi");
		rs.updateString(3, "atmakur");
		rs.updateRow();
		System.out.println("press enter");
		System.in.read();
		rs.moveToInsertRow();
		rs.updateInt(1, 777);
		rs.updateString(2, "saitej");
		rs.updateString(3, "gudur");
		rs.insertRow();
		System.out.println("press enter");
		System.in.read();
		rs.absolute(4);
		rs.deleteRow();
		
		rs.absolute(3);
		System.out.println("==== modified absolute(3)=====");
		System.out.println(rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3));
		rs.close();
		con.close();
	}
}
