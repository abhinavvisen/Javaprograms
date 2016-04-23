import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
public class saiawt13 extends Frame implements MouseListener
{
	Label lblInfo;
	List lstInfo;

  public saiawt13(String title)
  {
    super(title);

    setLayout(new FlowLayout());
    lstInfo = new List(50);

    lblInfo = new Label("List of Events");

    add(lblInfo);
    add(lstInfo);


	addMouseListener(this);


}
	public void mousePressed(MouseEvent e)
  	{
		System.out.println(e);
		 lstInfo.add("Mouse Pressed");

 	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println(e);
					 lstInfo.add("Mouse Released");

	}
      	public void mouseEntered(MouseEvent e)
      	{

         	System.out.println("Mouse entered");
         	lstInfo.add("Mouse Entered in the Frame");
      	}

      	public void mouseExited(MouseEvent e)
      	{
         	System.out.println("Mouse exited");
         	lstInfo.add("Mouse Entered another application, exited Frame");
      	}

      	public void mouseClicked(MouseEvent e)
      	{
				System.out.println(e);
         	System.out.println("Mouse clicked  "
                      + e.getClickCount() );
           lstInfo.add("Mouse Clicked");
      	}


  public static void main(String args[])
  {
	  saiawt13 app = new saiawt13("Sai Compusys");
	  app.setSize(500,500);
	  app.setVisible(true);
  }
}



