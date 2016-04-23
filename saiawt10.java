import java.awt.*;
import java.awt.event.*;
class saiawt10 extends Frame implements ActionListener
{
	public Label lblInfo;
	public Choice cboFruits;
	public Button btnOK,btnExit;

	public saiawt10(String title)
	{
			super(title);
			lblInfo = new Label("Name of Fruits");

			cboFruits = new Choice();
			cboFruits.add("Orange ");
			cboFruits.add("Banana");
			cboFruits.add("Apple");

			btnOK = new Button("OK");
			btnExit = new Button("Exit");
			setLayout(new FlowLayout());
			add(lblInfo);
			add(cboFruits);
			add(btnOK);
			add(btnExit);

			btnOK.addActionListener(this);

			btnExit.addActionListener(this);
			//setSize(500,500);
			//show();
	}

	public void actionPerformed(ActionEvent e)
	{
		//System.out.println("Contents of e : " + e);
		if(e.getSource() == btnOK)
		{
			System.out.println(cboFruits.getSelectedItem());
		}
		if(e.getSource() == btnExit)
		{
			System.exit(0);
		}

	}
	public static void main(String args[])
	{
		saiawt10 s = new saiawt10("Sai Compusys");
		s.setSize(500,500);
		s.show();
	}
}
