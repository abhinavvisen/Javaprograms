import java.awt.*;
import java.applet.*;
public class ImageDemopara extends Applet
	{
		Image i;
		public void init()
		{
			String imagname=getParameter("image");
			i=getImage(getCodeBase(),imagname);
	}
	public void paint(Graphics g)
	{
		g.drawImage(i,20,20,this);
	}

}
