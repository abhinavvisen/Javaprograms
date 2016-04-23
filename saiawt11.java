import java.awt.*;
import java.awt.event.*;
class saiawt11 extends Frame implements ActionListener
{
	public TextField txtNum1,txtNum2,txtRes;
	public Button btnAdd,btnSubs,btnMult,btnDiv,btnExit;
	public int Num1,Num2,Res;

	public saiawt11(String title)
	{
			super(title);
			txtNum1 = new TextField(10);
			txtNum2 = new TextField(10);
			txtRes = new TextField(10);

			btnAdd = new Button("+");
			btnSubs = new Button("-");
			btnMult = new Button("*");
			btnDiv = new Button("/");
			btnExit = new Button("Exit");

			setLayout(new FlowLayout());

			add(txtNum1);
			add(txtNum2);
			add(txtRes);
			add(btnAdd);
			add(btnSubs);
			add(btnMult);
			add(btnDiv);
			add(btnExit);

			btnAdd.addActionListener(this);
			btnSubs.addActionListener(this);
			btnMult.addActionListener(this);
			btnDiv.addActionListener(this);
			btnExit.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource() == btnAdd)
			{
				if(txtNum1.getText().equals("") || txtNum2.getText().equals(""))
				{
					System.out.println("No Information to Add");
				}
				else
				{
					Num1 = Integer.parseInt(txtNum1.getText());
					Num2 = Integer.parseInt(txtNum2.getText());

					Res = Num1 + Num2;

					txtRes.setText(String.valueOf(Res));
				}


			}
			if(e.getSource() == btnSubs)
						{
							if(txtNum1.getText().equals("") || txtNum2.getText().equals(""))
							{
								System.out.println("No Information to Substract");
							}
							else
							{
								Num1 = Integer.parseInt(txtNum1.getText());
								Num2 = Integer.parseInt(txtNum2.getText());

								Res = Num1 - Num2;

								txtRes.setText(String.valueOf(Res));
							}
			}
			if(e.getSource() == btnMult)
									{
										if(txtNum1.getText().equals("") || txtNum2.getText().equals(""))
										{
											System.out.println("No Information to mul");
										}
										else
										{
											Num1 = Integer.parseInt(txtNum1.getText());
											Num2 = Integer.parseInt(txtNum2.getText());

											Res = Num1* Num2;

											txtRes.setText(String.valueOf(Res));
										}
			}
			if(e.getSource() == btnDiv)
												{
													if(txtNum1.getText().equals("") || txtNum2.getText().equals(""))
													{
														System.out.println("No Information to div");
													}
													else
													{
														Num1 = Integer.parseInt(txtNum1.getText());
														Num2 = Integer.parseInt(txtNum2.getText());

														Res = Num1/Num2;

														txtRes.setText(String.valueOf(Res));
													}
						}


			if(e.getSource() == btnExit)
			{
					System.exit(0);
			}

	}
	public static void main(String args[])
	{
			saiawt11 s = new saiawt11("Sai Compusys");

			s.setSize(500,500);

			s.setVisible(true);
	}
}


















































