class catch22
{
public static void main(String args[])
{
	try
	{
	String num=args[0];
	int numval=Integer.parseInt(num);
	System.out.println("The square is"+numval*numval);
	}
	catch(ArrayIndexOutOfBoundsException ne)
	{

		System.out.println("No arguments given");
	}
	catch(NumberFormatException nb)
		{

			System.out.println("number formet");
		}
}
}
