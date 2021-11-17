package sample1029_Interface;

public class PointColor 
{
	private int x;
	private int y;
	private RGB rgb; //데이터 타입이 RGB임. 
	
	
	public PointColor() 
	{
		this(0, 0, new RGB());
		//RGB의 객체를 생성해주는 것, 생성하면 빈 생성자를 찾고, 빈 생성자는 0,0,0의 값을 다시 매개변수 세개짜리 생성자를 찾음
	}
	
	public PointColor(int x, int y, RGB rgb) 
	{
		// super(); 얘가 생략되어 있음. 조상이 Object임
		this.x = x;
		this.y = y;
		this.rgb = rgb;
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
	
	public RGB getRGB() 
	{
		return rgb;
	}
	
	public void setRGB(RGB rgb) 
	{
		this.rgb = rgb;
	}
}
