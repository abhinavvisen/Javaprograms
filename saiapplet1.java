import java.applet.Applet;
import java.awt.Graphics;

public class saiapplet1 extends Applet

{
	String s;
	 public void init()
	 	{
		s="Sai Compusys";

		}


	 public void paint(Graphics g)
	  {

		g.drawString(s, 200, 100);
	  }
}
