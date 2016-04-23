import java.awt.*;
class saiawtmenu extends Frame
{
	Label l;
	public saiawtmenu(String title)
	{
			super(title);
			MenuBar mb = new MenuBar();
			Menu m = new Menu("File");
			Menu e=new Menu("Edit");
			m.add(new MenuItem("New"));
			m.add(new MenuItem("Open",new MenuShortcut('O')));
			m.add (new MenuItem ("Print", new MenuShortcut('p')));

			m.addSeparator();
			m.add(new MenuItem("Save"));
			m.add(new MenuItem("Save As"));
			e.add(new MenuItem("Cut"));
			e.add(new MenuItem("Copy"));
			e.add(new MenuItem("Paste"));
			mb.add(m);
			mb.add(e);
			setMenuBar(mb);
	}

	public static void main(String args[])
	{
		saiawtmenu s = new saiawtmenu("Sai Compusys");

		s.setSize(300,200);
		s.show();
	}
}

