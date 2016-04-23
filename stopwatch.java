import java.awt.*;
import java.awt.event.*;
class stopwatch extends Frame implements Runnable
{
public Font f= new Font("Times New Roman",Font.BOLD,24);
public TextField t=new TextField();
public stopwatch(String title)
{
super(title);
add(t);
}
public int seconds;
public int minutes;
public int hours;
public void create()
{
Thread t1= new Thread(this);
t1.start();
}
public void run()
{
seconds=0;
minutes=0;
hours=0;
while(true)
{
try
{
Thread.sleep(1000);
seconds = seconds + 1;
if(seconds==60)
{
seconds=0;
minutes =  minutes+1;
}
if(minutes==60)
{
minutes = 0;
hours= hours+1;
}
if(hours==24)
{
hours=0;
}
}
catch(Exception e)
{
}
t.setFont(f);

t.setText(hours+"hour of stop"+minutes+"minute of stop"+seconds+"second of stop");
}
}
public static void main(String args[])
{
stopwatch s= new stopwatch("my stopwatch");
s.create();
s.setSize(500,500);
s.show();
}
}