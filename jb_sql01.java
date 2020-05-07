import java.sql.*;

class jb_sql01
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","task");
			Statement st=con.createStatement();
			
			ResultSet rs;
			String str;
			str="select * from emp";
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
