package RETRIEVING;

import java.sql.*;
import java.sql.DriverManager;

public class Callable1 {

	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "1245");
		CallableStatement stmt = con.prepareCall("{call Myproc1(?,?)}");
		stmt.setInt(1, 1004);
		stmt.registerOutParameter(2, Types.FLOAT);
		stmt.execute();
		float incsal = stmt.getFloat(2);
		System.out.println("inc sal: "+incsal);
		con.close();
	}

}
