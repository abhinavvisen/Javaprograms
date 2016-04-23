import java.awt.*;
import java.applet.*;
public class ImageDemo extends Applet
	{
		Image i;
		public void init()
		{
			i=getImage(getCodeBase(),"SAI1.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(i,20,20,this);
	}

}
