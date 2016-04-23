import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class painting extends Applet implements ActionListener,MouseListener
{
	Button b1=new Button("drawRect");
	Button b2=new Button("drawOvel");
	Button b3=new Button("drawLine");
	Button b4=new Button("Fillrect");
	Button b5=new Button("FillOval");
	int i=0,x1,x2,x3,x4;
	Panel p1=new Panel();
	public void init()
	{
		BorderLayout bb=new BorderLayout();
		setLayout(bb);
		add("South",p1);
		p1.add(b1);
			p1.add(b2);
				p1.add(b3);
					p1.add(b4);
					p1.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		addMouseListener(this);
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{}
	public void mousePressed(MouseEvent e)
		{
			x1=e.getX();
			x2=e.getY();
			System.out.println("P");

System.out.println(x1);
System.out.println(x2);

			}


	public void mouseMove(MouseEvent e)
			{
				/*x1=e.getX();
				x2=e.getY();
				System.out.println("M");
				System.out.println(x1);
System.out.println(x2);
				repaint();*/
			}

	public void mouseReleased(MouseEvent e)
				{
					x3=e.getX();
					x4=e.getY();
System.out.println("r");
				System.out.println(x3);
System.out.println(x4);
					repaint();
			}
			public void mouseEntered(MouseEvent e)
	{}
	public void mouseExited(MouseEvent e)
	{}
	public void actionPerformed(ActionEvent e)
		{
			String s=e.getActionCommand();
			if("drawRect".equals(s))
			{
				i=1;
				repaint();
			}
			if("drawOvel".equals(s))
						{
							i=2;
							repaint();
			}
			if("drawLine".equals(s))
									{
										i=3;
										repaint();
			}
			if("Fillrect".equals(s))
												{
													i=4;
													repaint();
			}
			if("FillOval".equals(s))
															{
																i=5;
																repaint();
			}
	}
public void paint(Graphics g)
{
	if(i==1)
	{
		g.drawRect(x1,x2,(x3-x1),(x4-x2));
		x3=x4=0;
	}
	if(i==2)
		{
			g.drawOval(x1,x2,(x3-x1),(x4-x2));
			x3=x4=0;
	}
	if(i==3)
			{
				g.drawLine(x1,x2,x3,x3);
				x3=x4=0;
	}
	if(i==4)
				{
					g.fillRect(x1, x2, (x3-x1),(x4-x2));

					x3=x4=0;
	}
	if(i==5)
					{
						g.fillOval(x1, x2, (x3-x1),(x4-x2));

						x3=x4=0;
	}
}
}




