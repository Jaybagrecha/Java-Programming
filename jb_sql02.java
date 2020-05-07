import java.sql.*;
import java.io.*;

class jb_sql02
{
	public static void main(String args[])
	 {
	   int no;
	   String nm;
	   int age;
	   
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	   try 
	     {
	       System.out.println("\n\tEnter new Emp no.:");
	       no=Integer.parseInt(br.readLine());
	       nm=br.readLine();
	       age=Integer.parseInt(br.readLine());
	       
	       Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","task");
			Statement st=con.createStatement();
			
			ResultSet rs;
			String str;
			
			str="insert into emp values('"+no+"','"+nm+"','"+age+"')";
			st.executeUpdate(str);
			str="Select * from emp";
			rs=st.executeQuery(str);
			
			while(rs.next())
			{
				System.out.println("\n\t Emp Number ="+rs.getInt(1));
				System.out.println("\n\t Emp Name ="+rs.getString(2));
				System.out.println("\n\t Emp Age ="+rs.getInt(3));
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
