import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Class.forName("com.mysql.jdbc.Driver"); 
		  
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/F0654?characterEncoding=UTF-8","root","root123");
		  //  System.out.println(con);
		   
		    Statement stmt = (Statement) con.createStatement();
		    System.out.println("inserting table");
		   // String sql = "Insert into trppkg values(46)";
		    String sql ="Update trppkg set pkgid=46 where pkgid=44";
		 stmt.executeUpdate(sql); 
		    
		} catch ( Exception e) {
		    e.printStackTrace();
		}

	}

}
