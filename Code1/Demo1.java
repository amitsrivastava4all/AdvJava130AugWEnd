import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Enter the Id to Search");
		String id = new Scanner(System.in).nextLine();  // 0000 or 1=1
		System.out.println("Enter the name");
		String name = new Scanner(System.in).nextLine();
		// TODO Auto-generated method stub
		// Load the driver
		//com.mysql.jdbc.Driver
		// oracle.jdbc.driver.OracleDriver
		//org.postgresql.Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Create the Connection
		// jdbc:mysql://hostname:port/dbname 3306
		// jdbc:oracle:thin:@hostname:port:ServiceId 1521
		// jdbc:postgresql://hostname:port/dbname 5432
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingdb","root","");
//		if(con!=null){
//			System.out.println("Connect...");
//		}
		// Query
		// select * from customer where id=1001 and name='tim or 1=1'
		PreparedStatement pstmt = con.prepareStatement("select * from customer "
				+ "where id=? and name=?");
		pstmt.setInt(1, Integer.parseInt(id));
		pstmt.setString(2, name);
		ResultSet rs = pstmt.executeQuery();
		//Statement stmt = con.createStatement();
		// Execute query and store the result in resultset
		// select * from customer where id=0000 or 1=1
		//ResultSet rs = stmt.executeQuery("select * from customer where id="+id );
		boolean isFound = false;
		while(rs.next()){
			isFound = true;
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("salary"));
		}
		if(!isFound){
			System.out.println("No Record Found...");
		}
		rs.close();
		pstmt.close();
		con.close();
	}

}
