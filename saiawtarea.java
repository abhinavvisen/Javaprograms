import java.awt.*;
class saiawtarea extends Frame
{
	public Label lblInfo;
String s =
    "This is a very long message " +
    "It should wrap when there is " +
    "no horizontal scrollbar.";


	public saiawtarea(String title)
	{
			super(title);
			lblInfo = new Label("TEXT AREA");
		TextArea sn=	new TextArea (s, 4, 15,
			      TextArea.SCROLLBARS_NONE);
			 TextArea sb=   new TextArea (s, 4, 15,
			      TextArea.SCROLLBARS_BOTH);
			    TextArea sh=new TextArea (s, 4, 15,
			      TextArea.SCROLLBARS_HORIZONTAL_ONLY);
			    TextArea sv=new TextArea (s, 4, 15,
      TextArea.SCROLLBARS_VERTICAL_ONLY);

			add(sn);
			add(sb);
			add(sh);
			add(sv);

				add(lblInfo);

			setLayout(new FlowLayout());

	}
	public static void main(String args[])
	{
		saiawtarea s = new saiawtarea("TEXT AREA");
		s.setSize(200,400);
		s.show();
	}
}
/*There is a four-argument constructor that accepts a fourth parameter of a scrollbar policy.
The different settings are the class constants: SCROLLBARS_BOTH, SCROLLBARS_HORIZONTAL_ONLY, SCROLLBARS_NONE, and SCROLLBARS_VERTICAL_ONLY.
When the horizontal (bottom) scrollbar is not present, the text will wrap. */