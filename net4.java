//server
import java.net.*;
import java.io.*;
class net4
{
	public static void main(String args[])
	{
	try
	{
	ServerSocket ss= new ServerSocket(101);
	System.out.println("\n\t waiting for client");
	Socket cs2=null;
	cs2=ss.accept();
	System.out.println("\n\t connected to client"+cs2);
	//** always application from here**
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str;
	PrintWriter pw=new PrintWriter(cs2.getOutputStream(),true); 
	while(true)
	{
	System.out.println("\n\tEnter message");
	str=br.readLine();
	pw.write(str+"\n");
	pw.flush();
	System.out.println("\n\tmessage transmitted");
	if (str.equals("bye"))
	  break;
	}
	cs2.close();
	ss.close();
	}
	catch(Exception e)
	{
	System.out.println("");
	}
	}
}
	
	