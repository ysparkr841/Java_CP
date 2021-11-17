package sample1029_Interface;

public interface GraphicsCard 
{
	//제조사
	public String company();
	
	//모델명
	public String model();
	
	//메모리
	public int memory();
	
	//출력
	public void write(PointColor pointColor);
}
