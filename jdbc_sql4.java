import java.sql.*;
import java.io.*;

class jdbc_sql4
{

  public static void main( String args[])
  { 
    int no;
   
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  try
  {
      System.out.println("\n\t enter emp no to delete:");
      no=Integer.parseInt(br.readLine());
      
      Class.forName("com.mysql.jdbc.Driver");   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mitali","root","task");
 Statement st=con.createStatement(); 
		ResultSet rs;
		String str;
		
		str="delete from emp where eno="+no;
		st.executeUpdate(str);
		
		str="select * from emp";    
		rs=st.executeQuery(str);
		while(rs.next())   
		{ 
		System.out.println("\n\t Emp No = "+rs.getInt(1));
		System.out.println("\n\t Name = "+rs.getString(2));
		System.out.println("\n\t Age = "+rs.getInt(3));
		}
		rs.close();
		con.close();
   }
   catch(Exception e)
   {
   System.out.println(""+e);
   }
		
	}
}
