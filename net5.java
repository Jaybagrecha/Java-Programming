//client
import java.net.*;
import java.io.*;
class net5
{
	public static void main(String args[])
	{
	try
	{ 
	//InetAddress ia=InetAddress.getLocalHost();
	InetAddress ia=InetAddress.getByName("TASK_1");
	Socket cs1=new Socket(ia,101);
	System.out.println("\n\t willingness registered at server");
	System.out.println("\n\t connected to server and socket "+cs1);
	//**always application after this**
	BufferedReader br=new BufferedReader(new InputStreamReader(cs1.getInputStream()));
	String str;
	while(true)
	{
	str=br.readLine();
	System.out.println("\n\t received"+str);
	if(str.equals("bye"))
	   break;
	}
	cs1.close();
	
	}
	catch	(Exception e)
	{
	System.out.println("");
	}
	}
}
	