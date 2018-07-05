package RETRIEVING;
import java.io.*;
import java.sql.*;

public class Clob1 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		PreparedStatement stmt = con.prepareStatement("insert into Myclob values(?,10)");
		File f =new File("E:\\demo.txt");
		FileReader fr = new FileReader(f);
		stmt.setCharacterStream(1, fr, (int)f.length());
		System.out.println("file size ="+f.length());
		System.out.println("no of rows affected ="+stmt.executeUpdate());
		con.close();
		
	}

}
