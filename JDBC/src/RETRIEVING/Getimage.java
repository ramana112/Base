package RETRIEVING;

import java.io.FileOutputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Getimage {

	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from bigtab2");
		rs.next();
		Blob b = rs.getBlob(1);
		byte b1[] = new byte[(int)b.length()];
		b1 = b.getBytes(1, (int)b.length());
		System.out.println("image length = "+ b.length());
		FileOutputStream fos = new FileOutputStream("e:\\image.jpg");
		fos.write(b1);
		fos.close();
		con.close();
		
	}

}
