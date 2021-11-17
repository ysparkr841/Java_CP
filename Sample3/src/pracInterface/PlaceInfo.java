package pracInterface;

public class PlaceInfo {
	private int x;
	private int y;
	private Ground ground;
	
	public PlaceInfo() 
	{
		this(0, 0, new Ground());
	}
	
	public PlaceInfo(int x, int y, Ground ground) 
	{
		setX(x);
		setY(y);
		setGround(ground);
	}
	
	public int getX() 
	{
		return x;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public void setY(int y) 
	{
		this.y = y;
	}
	
	public Ground getGround() 
	{
		return ground;
	}
	
	public void setGround(Ground ground) 
	{
		this.ground = ground;
	}
}
