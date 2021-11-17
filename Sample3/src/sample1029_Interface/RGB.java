package sample1029_Interface;

public class RGB {
	private int red;
	private int green;
	private int blue;
	
	public RGB()
	{
		this(0, 0, 0); //아무것도 입력안하면 0 , 0 , 0 줌.
	}
	
	RGB(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getRed() 
	{
		return red;
	}
	
	public void setRed(int red) 
	{
		this.red = red;
	}
	
	public int getGreen() 
	{
		return green;
	}
	
	public void setGreen(int green) 
	{
		this.green = green;
	}
	
	public int getBlue() 
	{
		return blue;
	}
	
	public void setBlue(int blue) 
	{
		this.blue = blue;
	}
	
	
}
