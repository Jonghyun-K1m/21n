package home;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import config.*;

public class test {
	

	
 	public static void main(String[] args) {
 		 getProperties getP= new getProperties();
 		 Connection conn = null;
 		 PreparedStatement ps = null;
 		 ResultSet rs = null;
 		int result = 0;
		try {
			System.out.println("comm");
			Class.forName(getP.get_driver());
			conn = DriverManager.getConnection(getP.get_url(), getP.get_dbuser(), getP.get_dbpwd());
		//	String sql = "select u_id, u_pw from user_db where u_id = ? ";
		//	String sql = "select u_id, u_pw from user_db where u_id = ? ";
				String sql = "insert into user_db value(?,?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, "abc1123");
				ps.setString(2, "123");
				ps.setString(3, "abc");
				result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
 	}
			
}


 /*    String driverName = pro.getProperty("driver");
     String url = pro.getProperty("url");
     String user = pro.getProperty("user");
     String pwd = pro.getProperty("password");
     
     System.out.println("jdbc.properties 에서 불러온 데이터");
     System.out.println("driverName :"+driverName);
     System.out.println("url :"+url +" /user :"+user+" /pwd :"+pwd);*/
