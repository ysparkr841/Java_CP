package sample1029_Interface;

public class GraphicsCardMain {

	public void operatingSystemWrite(GraphicsCard graphicsCard, PointColor pointColor) 
	{
		//운영체제 입장에서는 인터페이스인 크래픽카드만 바라보면 됨
		if(graphicsCard != null) 
		{
			System.out.println("그래픽 카드 정보==");
			System.out.println("회사명 : "+graphicsCard.company());
			System.out.println("모델명 : "+graphicsCard.model());
			System.out.println("메모리 : "+graphicsCard.memory());
		
			System.out.println("출력 순서");
			
			graphicsCard.write(pointColor);
			
		}
	}
	
	public static void main(String[] args) {
		GraphicsCard amdRadeon = new AmdRadeon("Rx 5000", 4096); //AmdRadeon은 GraphicsCard를 상속받음
		//AmdRadeon amdRadeon = new AmdRadeon("Rx 5000", 4096); 원래는 이렇게.
		
		NvidiaGeForce nvidiaGeForce = new NvidiaGeForce("Geforce GT 710", 2048);
		// GraphicsCard nvidiaGeForce = new NvidiaGeForce("Geforce GT 710", 2048); 이렇게도 가능.
		
		//포인트 칼라 생성
		PointColor pointColor = new PointColor();
		//여기서 PointColor pointColor;까지만 하면 null값이 됨.
		pointColor.setX(100);
		pointColor.setY(200);
		pointColor.setRGB(new RGB(255, 128, 100)); //new RGB(...)는 주소값을 리턴해줌.
		
		GraphicsCardMain graphicsCardMain = new GraphicsCardMain();
		graphicsCardMain.operatingSystemWrite(amdRadeon, pointColor);
		
		System.out.println();
		graphicsCardMain.operatingSystemWrite(nvidiaGeForce, pointColor);
		
	}

}
