import java.sql.*;
class jdbc_sql1      //to retrieve data
{
public static void main(String args[])
{
   try
   {
    Class.forName("com.mysql.jdbc.Driver");   //check for availibility  of mysql driver
    // Class.forName("jdbc:odbc:JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mitali","root","task");
		//establish connection by specifying database name
    Statement st=con.createStatement();           //provision for sql statement
       	//following code will retrieve record
		ResultSet rs;
		String str;
		str="select * from emp";    //only change
		rs=st.executeQuery(str);
		while(rs.next())      // rs.next() will read current record and then moves next
		{
		System.out.println("\n\t Emp No = "+rs.getInt(1));
		System.out.println("\n\t Name = "+rs.getString(2));
		System.out.println("\n\t Age = "+rs.getInt(3));
		}
		rs.close();
		con.close();
   }//try ends
   catch(Exception e)
   {
   System.out.println(""+e);
   }//catch ends
		
	}
}
		
		
		
		
		
	
