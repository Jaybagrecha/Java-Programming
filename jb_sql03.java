import java.sql.*;
import java.io.*;

class jb_sql03
{
	public static void main(String args[])
	 {
	   int no,no1;
	   String nm;
	   int age;
	   
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	   try 
	     {
	        System.out.println("\n\tEnter emp no to modify.:");
	       no1=Integer.parseInt(br.readLine());
	       System.out.println("\n\tEnter emp no  modified:");
	       no=Integer.parseInt(br.readLine());
	       
	      
	       
	       System.out.println("\n\tEnter new Emp name.:");
	       nm=br.readLine();
	       
	       System.out.println("\n\tEnter modified Emp age.:");
	       age=Integer.parseInt(br.readLine());
	       
	       Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","task");
			Statement st=con.createStatement();
			
			ResultSet rs;
			String str;
			
			str="update emp set eno='"+no+"',ename='"+nm+"',eage='"+age+"'where eno="+no1;
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
