package prac1101;

public class PlaceInfo {
	private int x;
	private int y;
	private Ground ground;
	
	PlaceInfo()
	{
		this(0,0, new Ground());
	}
	
	PlaceInfo(int x, int y, Ground ground)
	{
		this.x = x;
		this.y = y;
		this.ground = ground;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public void setY(int y) 
	{
		this.y = y;
	}
	
	public void setGround(Ground ground) 
	{
		this.ground = ground;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public Ground getGround() 
	{
		return ground;
	}

}
