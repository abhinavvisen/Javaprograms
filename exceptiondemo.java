class exceptiondemo
{
public static void main(String args[])
	{
		try
		{

		String text=args[0];
		System.out.println(text);
		}
		catch(Exception e)
		{
		System.out.println("No arguments given");
		}

	}
}