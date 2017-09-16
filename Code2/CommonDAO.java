import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public interface CommonDAO {
	public static ResourceBundle readPropertyFile(){
		ResourceBundle rb = ResourceBundle.getBundle("db");
		return rb;
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb = readPropertyFile();
		Class.forName(rb.getString("drivername"));
		Connection con = DriverManager.getConnection(rb.getString("url"),rb.getString("userid"),"");
		return con;
	}

}
