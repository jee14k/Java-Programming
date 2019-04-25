/*
<applet code = bouncing height = 900 width = 900>
</applet>
*/
import java.applet.*;
import java.awt.*;
public class bouncing extends Applet implements Runnable
{
	Thread t;
	int x,y;
	int h,w;
	int s1,s2;
	public bouncing()
	{
		t = new Thread(this);
		t.start();
	}
	public void init()
	{
		y = 10;
		s1=0;
		s2=0;
		x=10;
		h=getSize().height;
		w=getSize().width;
	}
	public void run()
	{
		while(true)
		{
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.setColor(Color.blue);
		g.fillOval(y,x,30+s1,30+s2);
		if(x<h)
			x=x+10;
		else
		{
			y=y+40;
			s1 = s1+5;
			s2 = s2+5;
			x=10;
		}
		try
		{
			Thread.sleep(50);
		}catch(InterruptedException e) 
		{}
	}
}