class exceptiondemo1
{
public static void main(String args[])
{
	try
	{
	int a=10;
	int b=2;
	int c;
	c=a/b;

	System.out.println(c);
	System.out.println("Hello");


	}
	catch(Exception e)
	{
		System.out.println("can not input zero ");
	System.out.println("Type of exception is=:"+e.toString());
		e.printStackTrace();

	}

finally
	{
	System.out.println("sairam");
	}
}
}
/*toString is public method defined in object class
and inherited by exception .This method is
used to retrive a String representation of the
information stored in exception object*/
/*printStrancTrace() is method defined in exception and
is used to print out the information
regarding the exception that is how it is occured and which line
in the code genereted it*/













