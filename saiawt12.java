import java.awt.*;
import java.awt.event.*;
class saiawt12 extends Frame implements ActionListener
{
	public TextField txtDisplay;
	public Button btnAdd,btnSubs,btnMult,btnDiv,btnExit,btnEquals;
	public int Num1,Num2,Res;
	public String oper;

	public saiawt12(String title)
	{
			super(title);
			txtDisplay = new TextField(10);


			btnAdd = new Button("+");
			btnSubs = new Button("-");
			btnMult = new Button("*");
			btnDiv = new Button("/");
			btnExit = new Button("Exit");
			btnEquals = new Button(" = ");

			setLayout(new FlowLayout());

			add(txtDisplay);
			add(btnAdd);
			add(btnSubs);
			add(btnMult);
			add(btnDiv);
			add(btnExit);
			add(btnEquals);

			btnAdd.addActionListener(this);
			btnSubs.addActionListener(this);
			btnMult.addActionListener(this);
			btnDiv.addActionListener(this);
			btnExit.addActionListener(this);
			btnEquals.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource() == btnAdd || e.getSource() == btnSubs || e.getSource() == btnMult || e.getSource() == btnDiv)
			{
					Num1 = Integer.parseInt(txtDisplay.getText());
					if(e.getSource() == btnAdd)
					{
						oper = "+";
					}
					if(e.getSource() == btnSubs)
					{
						oper = "-";
					}
					if(e.getSource() == btnMult)
					{
						oper = "*";
					}
					if(e.getSource() ==btnDiv )
					{
						oper = "/";
					}
					//same for mult and div
					txtDisplay.setText("");
			}
			if(e.getSource() == btnEquals)
			{
					Num2 = Integer.parseInt(txtDisplay.getText());
					if(oper == "+")
					{
								Res = Num1 + Num2;
					}
					if(oper == "-")
					{
								Res = Num1 - Num2;
					}
					if(oper == "*")
					{
								Res = Num1 * Num2;
					}
					if(oper == "/")
					{
								Res = Num1 / Num2;
					}
					txtDisplay.setText(String.valueOf(Res));
			}
			//same as above formult,div
			if(e.getSource() == btnExit)
			{
					System.exit(0);
			}

	}
	public static void main(String args[])
	{
			saiawt12 s = new saiawt12("Sai Compusys");

			s.setSize(300,300);

			s.setVisible(true);
	}
}




















































