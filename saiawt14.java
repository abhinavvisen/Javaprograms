import java.awt.*;
import java.awt.event.*;

public class saiawt14 extends Frame implements ItemListener {
   private TextField t;
   private Font plainFont, boldFont, italicFont, boldItalicFont;
   private CheckboxGroup fontStyle;
   private Checkbox plain, bold, italic, boldItalic;

   public saiawt14(String title)
   {
   		super(title);

      t = new TextField( "Sai Compusys", 40 );

      add( t );

      // Create CheckboxGroup to maintain radio buttons
      fontStyle = new CheckboxGroup();

		setLayout(new FlowLayout());

      plain = new Checkbox( "Plain", fontStyle, true );
      plain.addItemListener( this );
      add( plain );

      bold = new Checkbox( "Bold", fontStyle, false );
      bold.addItemListener( this );
      add( bold );

      italic = new Checkbox( "Italic", fontStyle, false );
      italic.addItemListener( this );
      add( italic );

      boldItalic = new Checkbox( "Bold/Italic",
                                 fontStyle, false );
      boldItalic.addItemListener( this );
      add( boldItalic );

      plainFont = new Font( "Times New Roman", Font.PLAIN, 20 );
      boldFont = new Font( "Arial", Font.BOLD, 14 );
      italicFont = new Font( "Courier", Font.ITALIC, 16 );
      boldItalicFont = new Font( "Courier",
                                 Font.BOLD + Font.ITALIC, 18 );
      t.setFont( plainFont );
      //alternative code for windowAdapter is given below in comment
      addWindowListener(new WindowAdapter() {

	        public void windowClosing(WindowEvent e)
	        {
	          setVisible(false);
	          dispose();
	          System.exit(0);
      }});

      setSize(500,500);
   }

   public void itemStateChanged( ItemEvent e )
   {
	   System.out.println(e);
	   //verifies the checkbox selected and accordingly
	   //sets the font in the TextField
      if ( e.getSource() == plain )
         t.setFont( plainFont );
      else if ( e.getSource() == bold )
         t.setFont( boldFont );
      else if ( e.getSource() == italic )
         t.setFont( italicFont );
      else if ( e.getSource() == boldItalic )
         t.setFont( boldItalicFont );
   }

   public static void main(String args[])
   {
   	saiawt14 s = new saiawt14("Sai Compusys");
   	s.setVisible(true);
   }
}



