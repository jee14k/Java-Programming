import java.awt.Color;
import java.awt.Graphics;
public class Scoreplus 
{
	private int xCoor, yCoor, width, height;
	private int score=0;
	public Scoreplus(int xCoor, int yCoor, int tileSize)
	{
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		height = tileSize;
	}
	public void drawScore(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawString("Score: "+score,0,yCoor * height - 20);
	}
	public void setScore(int score)
	{
		this.score=score;
	}
	public int getxCoor()
	{
		return xCoor;
	}
	public void setxCoor(int xCoor)
	{
		this.xCoor = xCoor;	
	}
	public int getyCoor()
	{
		return yCoor;
	}
	public void setyCoor(int yCoor)
	{
		this.yCoor = yCoor;
	}
}