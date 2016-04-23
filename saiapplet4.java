import java.applet.*;
import java.awt.*;

public class saiapplet4 extends Applet
{

	  int AppletHeight;
	  int AppletWidth;
	  int RectHeight;
	  int RectWidth;
	  int RectTop;
	  int RectLeft;


	  public void init()
	  {

		Dimension d = size();
		System.out.println(d);
		AppletHeight = d.height;
		AppletWidth = d.width;
		RectHeight = AppletHeight/3;
		RectWidth = AppletWidth/3;
		RectTop = RectHeight;//(AppletHeight - RectHeight)/2;
		RectLeft= (AppletWidth - RectWidth)/4;
		repaint();

	  }

	  public void paint(Graphics g)
	  {

		g.drawRect(0, 0, AppletWidth-1, AppletHeight-1);
		g.fillRect(RectLeft, RectTop, RectWidth-1, RectHeight-1);

	  }

}



