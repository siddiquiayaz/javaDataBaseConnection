package hibernateInternal;

import java.sql.Connection;
import java.sql.PreparedStatement;

;

 class Operate {
	
	public  void  save ( Object o) {
		
		if (o instanceof Employee)
			try {
		  Employee em=(Employee)o;
		   Connection c=ConnectionProvider.getCon();
		   System.out.println(c);
		   PreparedStatement ps=c.prepareStatement("insert into emp1 values(?,?,?) ");
		   ps.setInt(1, em.getId());
		   ps.setString(2, em.getName());
		   ps.setString(3, em.getAdress());
		      int i=ps.executeUpdate();
		      if(i>0) 
		    	  System.out.println("data inserted");
		      else 
				 System.out.println("data not inserted");
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
