/*
<applet code = pen height=800 width=800>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class pen extends Applet implements MouseMotionListener, MouseListener
{
	int x1,x2,y1,y2;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
		x1=0;x2=0;y1=0;y2=0;
	}
	public void mousePressed(MouseEvent e)
	{
		x1=e.getX();
		y1=e.getY();
	}
	public void mouseDragged(MouseEvent e)
	{
		x2=e.getX();
		y2=e.getY();
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.drawLine(x1,y1,x2,y2);
		x1=x2;
		y1=y2;
	}
	public void mouseEntered(MouseEvent e)
	{}
	public void mouseExited(MouseEvent e)
	{}
	public void mouseClicked(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	public void mouseMoved(MouseEvent e)
	{}
}