package com.srivastava.apps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Model {
	
	private Connection getConnection() throws NamingException, SQLException{
		Context initContext  = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource dataSource = (DataSource)envContext.lookup("jdbc/onlineshop");
		Connection con = dataSource.getConnection();
		return con;
		
	}
	public ArrayList<ProductDTO> getProducts(double price) throws SQLException, NamingException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> productList = new ArrayList<>();
		
		final String SQL = "select id, name, descr, price, image from product where price>=?";
		try{
			con = getConnection();
			pstmt = con.prepareStatement(SQL);
			pstmt.setDouble(1, price);
			rs = pstmt.executeQuery();
			while(rs.next()){
				productList.add(new ProductDTO(rs.getInt("id"),rs.getString("name"),rs.getString("descr"),rs.getDouble("price"),rs.getString("image")));
			}
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return productList;
	}
	

}
