import java.awt.*;
  class saiawt19 extends Frame
{
	public saiawt19()
	{


			setLayout(new GridLayout(4,3));

	        add(new Button("One"));
	        add(new Button("Two"));
	        add(new Button("Three"));
	        add(new Button("Four"));
	        add(new Button("Five"));
	       add(new Button("Six"));
	       add(new Button("Seven"));
	       add(new Button("Eight"));
	       add(new Button("Nine"));
	       add(new Button("Ten"));
	        add(new Button("Eleven"));
	        add(new Button("Twelve"));


      }
		public static void main(String argv[])
	{
        saiawt19 fa=new saiawt19();

        fa.setSize(400,300);
        fa.setVisible(true);
	}

}












