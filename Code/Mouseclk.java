/*
<applet code = Mouseclk height=800 width=800>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*; 	//subclass
public class Mouseclk extends Applet implements MouseListener
{
	int x,y;
	int width,height;
	public void init()
	{
		width = 500;
		height = 500;
		x = width;
		y = height;
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{

	}
	public void mouseExited(MouseEvent e)
	{

	}
	public void mouseReleased(MouseEvent e)
	{

	}
	public void mousePressed(MouseEvent e)
	{

	}
	public void paint(Graphics g)
	{
		g.drawString("CHRIST",x,y);
	}
}