package hibernateInternal;

import java.sql.*;

public final class ConnectionProvider {
	static Connection connection = null; 
	    private   ConnectionProvider() {
			
	    }
	
	    
	    public static  Connection getCon() {
			 if (connection ==null) 
				  try {
					  Class.forName("com.mysql.cj.jdbc.Driver");
					  connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/ayaz","root","@apple15");
					   //return connection;
					  
				  }  
				catch (Exception e) {
					e.printStackTrace();
				}
					   
			 
		   else {
			   return connection;
		   }
			return connection;		   
			   
					   
				
			 }
	    
			
	    }
	    

