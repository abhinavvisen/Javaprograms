import java.awt.*;
import java.awt.event.*;
class saiawt18 extends Frame
{
	Button btnb1,btnb2,btnb3,btnb4,btnb5;

	public saiawt18(String title)
	{
		super(title);
		//setLayout(new BorderLayout());

		btnb1 = new Button("NORTH");
		add(btnb1,"North");

		btnb2 = new Button("SOUTH");
		add(btnb2,"South");

		btnb3 = new Button("EAST");
		add(btnb3,BorderLayout.EAST);

		btnb4 = new Button("WEST");
		add(btnb4,"West");

		btnb5 = new Button("CENTER");
		add(btnb5,"Center");

	}
	public static void main(String args[])
	{
		saiawt18 s = new saiawt18("Border layout");
		s.setSize(400,400);
		s.setVisible(true);
	}
}