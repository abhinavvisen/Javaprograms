import java.awt.*;
public class saiawt20 extends Frame
{
	public saiawt20()
	{

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
	}
	public static void main(String argv[])
	{
        saiawt20 fa=new saiawt20();

        fa.setLayout(new GridLayout(2,5));
        fa.setSize(400,300);
        fa.setVisible(true);
	}

}