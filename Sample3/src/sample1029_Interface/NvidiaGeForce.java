package sample1029_Interface;

public class NvidiaGeForce implements GraphicsCard 
{
	private String company;
	private String model;
	private int memory;
	
	
	NvidiaGeForce(String model, int memory)
	{
		company = "NVIDIA";
		this.model = model;
		this.memory = memory;
	}
	
	
	@Override
	public String company() {
		return company;
	}

	@Override
	public String model() {
		return model;
	}

	@Override
	public int memory() {
		return memory;
	}

	@Override
	public void write(PointColor pointColor) 
	{
		if(pointColor != null) 
		{
			RGB rgb = pointColor.getRGB(); //PointColor가 RGB를 포함하고 있음. getRGB()는 시작 주소값을 리턴
			System.out.println("---"+company+" GraphicsCard 출력---");
			System.out.println("1. Color를 구성합니다.");
			
			if(rgb != null) 
			{
				System.out.println("Red : "+pointColor.getRGB().getRed());
				System.out.println("Green : "+pointColor.getRGB().getGreen());
				System.out.println("Blue : "+pointColor.getRGB().getBlue());
			}
			
			System.out.println("2. 좌표를 구합니다.");
			System.out.println("X : "+pointColor.getX());
			System.out.println("Y : "+pointColor.getY());
			
			System.out.println("3. 모니터 좌표에 색상을 출력합니다.");
		}
	}

}
