package sample1029_Interface;

public class AmdRadeon implements GraphicsCard
{
	
	//제조업체의 관련 변수들
	private String company;
	private String model;
	private int memory;
	
	//객체 생성시마다 매개변수 넘겨라 알겠냐?
	public AmdRadeon(String model, int memory) 
	{
		company = "AMD"; //어차피 회사는 정해짐 AmdRadeon임. 굳이 name을 받을 필요가 없음.
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

	//출력하는 부분.
	@Override
	public void write(PointColor pointColor) 
	{
		//null이 아닌 경우부터 반드시 해줘야 함.
		if(pointColor != null) 
		{
			RGB rgb = pointColor.getRGB(); //PointColor가 RGB를 포함하고 있음.
			System.out.println("---"+company+" GraphicsCard 출력---");
			System.out.println("1. Color를 구성합니다.");
			
			//rgb값이 존재하지 않는 경우 예외로하기
			if(rgb != null) //null이 아니란 소리는 객체가 생성되었다는 뜻임.
			{
				System.out.println("Blue : "+ pointColor.getRGB().getBlue());//pointColor.getRGB()하면 리턴 값이 rgb 참조변수임.
				System.out.println("Red : "+pointColor.getRGB().getRed());
				System.out.println("Green : "+pointColor.getRGB().getGreen());
			}
			
			System.out.println("2. 좌표를 구합니다.");
			System.out.println("X : "+pointColor.getX());
			System.out.println("Y : "+pointColor.getY());
			
			System.out.println("3. 모니터 좌표에 색상을 출력합니다.");
		}
	}
	
}
