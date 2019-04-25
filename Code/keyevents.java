/*
<applet code=keyevents height=900 width=900>
</applet>
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class keyevents extends Applet implements KeyListener
{
	String msg=" ";
	int x=30, y=30;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		int key=ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_LEFT: msg=msg+"<LeftArrow>";
			break;
			case KeyEvent.VK_RIGHT: msg=msg+"<RightArrow>";
			break;
			case KeyEvent.VK_UP: msg=msg+"<UpArrow>";
			break;
			case KeyEvent.VK_DOWN: msg=msg+"<DownArrow>";
			break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{}
	public void keyTyped(KeyEvent ke)
	{
		char c=ke.getKeyChar();
		msg=msg+c;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}