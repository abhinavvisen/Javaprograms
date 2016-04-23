class finallydemo
{
	String name;
	int no1,no2;
	finallydemo(String args[])
	{
		try
		{
			//name=new String("SaiCompusys");
			name="Sai";
			no1=Integer.parseInt(args[0]);
				no2=Integer.parseInt(args[1]);
				System.out.println(name);
					System.out.println("Division"+no1/no2);
				}
			catch(Exception i)
			{
					System.out.println("Can not divide by zero");
			}
			finally
			{
				name=null;
				System.out.println("Finally executed");
			}
	}

	public static void main(String args[])
	{
		new finallydemo(args);
}
}




