import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	public boolean add(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		Connection connection = null;
		PreparedStatement pstmt = null;
		final String SQL = "insert into users (userid,password) values(?,?)";
		try
		{
			connection = CommonDAO.getConnection();
			pstmt = connection.prepareStatement(SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			int noOfRecordsEffected = pstmt.executeUpdate();
			if(noOfRecordsEffected>0){
				return true;
			}
		}
		finally{
			if(pstmt!=null){
				pstmt.close();
			}
			if(connection!=null){
				connection.close();
			}
		}
		return false;
	}
	public String read(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		final String SQL = "select userid,password from users where userid=? and password=?";
		try
		{
			connection = CommonDAO.getConnection();
			pstmt = connection.prepareStatement(SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				return "Welcome "+userDTO.getUserid();
			}
		
	}
	finally{	
		if(rs!=null){
			rs.close();
		}
		if(pstmt!=null){
			pstmt.close();
		}
		if(connection!=null){
			connection.close();
		}
	}
		return "No Record Found...";

}
}