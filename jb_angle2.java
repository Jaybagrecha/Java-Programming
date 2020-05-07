import java.lang.*;
class jb_angle
{
	public static void main(String args[])
	{
		double deg,rad;
		deg=Double.parseDouble(args[0]);
		
		rad=(deg*3.1428)/180;

		System.out.printf("Radian=%.6f",rad);
	}
}
