import java.lang.*;
class jb_bill
{
	public static void main (String args[])
	{
		int qty;
		double price,bamt,gst,netamt;

		qty=Integer.parseInt(args[0]);
	        price=Double.parseDouble(args[1]);
		
		bamt=qty*price;
		gst=bamt*0.18;
		netamt=bamt+gst;

		System.out.println("Quantity:"+args[0]);
		System.out.println("Price:"+args[1]);
		System.out.println("Bill ="+netamt);
		System.out.printf("Bill = %.3f",+netamt);
	}
}
