import java.applet.*;
import java.awt.*;

public class saiapplet3 extends Applet
{

  int height, width;

  public void init()
  {

    Dimension d = size();
    System.out.println(d);
    height = d.height;
    width = d.width;
  }
  public void paint(Graphics g)
  {

    g.drawRect(0, 0, width, height);
	//g.fillRect(0, 0, width-200, height-100);
  }

}

