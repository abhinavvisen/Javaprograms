import java.applet.Applet;
import java.awt.*;
import java.util.*;
public class saiapplet2 extends Applet
{
	String str;

  public void init()
  {
    System.out.println("init event");
   	str = "Init event";
	repaint();
  }

  public void paint(Graphics g)
  {

    System.out.println("paint event");
    g.drawString("                  ",50,60);
    g.drawString(str,50,60);

  }

  public void start()
  {
    System.out.println("start event");
   str = "Start Event";
   repaint();
  }
	public void stop()
	{
		System.out.println("Stop event");
	}
  public void destroy()
  {
    System.out.println("destroy event");
    str = "Destroy Event";
   repaint();
  }

  public void update(Graphics g)
  {
    System.out.println("update event");
  }

  public boolean mouseUp(Event e, int x, int y)
  {
    System.out.println("mouseUp event");
    str = "MouseUp Event";
   repaint();
    return false;
  }

  public boolean mouseDown(Event e, int x, int y)
  {

   System.out.println("mouseDown event");
   str = "MouseDown Event";
   repaint();

   return false;
  }

  public boolean mouseDrag(Event e, int x, int y)
  {
    System.out.println("mouseDrag event");
        return false;
  }

  public boolean mouseMove(Event e, int x, int y)
  {
    System.out.println("mouseMove event" + x + " " + y);
    return false;
  }

  public boolean mouseEnter(Event e, int x, int y)
  {
    System.out.println("mouseEnter event");
    return false;
  }

 public boolean mouseExit(Event e, int x, int y)
 {
    System.out.println("mouseExit event");
    return false;
  }

  public void getFocus()
  {
    System.out.println("getFocus event");
  }

  public void gotFocus()
  {
    System.out.println("gotFocus event");

  }

  public void lostFocus()
  {
    System.out.println("lostFocus event");
  }

  public boolean keyDown(Event e, int x)
  {
    System.out.println("keyDown event");
    return false;
  }

}
