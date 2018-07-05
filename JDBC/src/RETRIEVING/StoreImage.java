package RETRIEVING;
import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class StoreImage {

		public static void main(String[] args) throws Exception{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		PreparedStatement stmt = con.prepareStatement("insert into bigtab2 values(?,1)");
		File f =new File("G:\\g.jpg");
		FileInputStream fis = new FileInputStream(f);
		stmt.setBinaryStream(1, fis,(int)f.length() );
		System.out.println("no of effected rows = "+stmt.executeUpdate());
		
	}

}
