package pracInterface;

public class SpawnMain {

	public void operatingSystemPrint(Spawn spawn, PlaceInfo placeInfo) 
	{
		if(spawn != null) 
		{
			System.out.println("==========스폰 진행==========");
			System.out.println("캐릭터명 : "+spawn.getChaN());
			System.out.println("직업 : "+spawn.getChaClass());
			System.out.println("레벨 : "+spawn.getLv());
			
			System.out.println("스폰 진행 ====>>>>>");
			if(placeInfo.getGround().getTopLv() < spawn.getLv()) 
			{
				System.out.println("캐릭터의 LV이 높아 "+placeInfo.getGround().getGRN()+" 지역에 입장할 수 없습니다.");
			}else if(placeInfo.getGround().getBottomLv() > spawn.getLv()) 
			{
				System.out.println("캐릭터의 LV이 낮아 "+placeInfo.getGround().getGRN()+" 지역에 입장할 수 없습니다.");
			}
			else 
			{
				spawn.print(placeInfo);				
			}
		}
	}
	
	public static void main(String[] args) {
		Park park = new Park("Ddupan", 77);
		Eui eui = new Eui("Euipan", 65);
		Spawn soo = new Soo("Soopan", 98);
		
		PlaceInfo placeInfo = new PlaceInfo();
		placeInfo.setX(55);
		placeInfo.setY(95);
		placeInfo.setGround(new Ground("Cortex", 85, 50));

		SpawnMain spawnMain = new SpawnMain();
		
		spawnMain.operatingSystemPrint(park, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		
		//지역 요구 레벨보다 낮추기.
		System.out.println("park lv값 변경 \"77\" -> \"49\"");
		park.setLv(49);
		spawnMain.operatingSystemPrint(park, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		
		spawnMain.operatingSystemPrint(eui, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		
		//지역 제한 레벨보다 올리기.
		System.out.println("eui lv값 변경 \"65\" -> \"95\"");
		eui.setLv(95);
		spawnMain.operatingSystemPrint(eui, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		
		spawnMain.operatingSystemPrint(soo, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		
		/*
		아래의 soo.setLv 메소드는 사용 자체가 불가. 왜일까?
		park와 eui의 참조변수와 다르게, soo는 타입이 Soo타입의 참조변수가 아닌, Spawn타입의 참조변수다.
		즉, 바라볼 수 있는 메소드는 Spawn 인터페이스에서 정의된 4가지 메소드이며, 해당 메소드를 상속받아 오버라이딩 한 각각의 메소드를 사용할 수 있다.
		그런데, Park과 Eui, Soo의 setLv()라는 메소드는 인터페이스에 정의되어 있지 않다. 따라서 Spawn 타입의 참조변수 soo는 해당 메소드를 사용해서
		lv의 값을 변경해 줄 수 없다. 만약 아래의 코드가 실행되게 하고 싶으면, 애초에 위의 객체 생성에서 
		Spawn soo = new Soo("Soooooo", 51); 이 부분을 -> Soo soo = new Soo("Soooooo", 51);로 해줘야 한다.
		
		soo.setLv(98);
		spawnMain.operatingSystemPrint(soo, placeInfo);
		System.out.println("<<<<<<<<<<<<<<구분>>>>>>>>>>>>>>");
		System.out.println();
		*/
		
		
		//지역 변경
		
		PlaceInfo placeInfo2 = new PlaceInfo(250, 300, new Ground("Foundry", 99, 80));
		
		System.out.println("지역 변경 후 각 캐릭터 스폰 정보 출력 \"Cortex\" -> \"Foundry\"");
		System.out.println();
		spawnMain.operatingSystemPrint(park, placeInfo2);
		System.out.println();
		spawnMain.operatingSystemPrint(eui, placeInfo2);
		System.out.println();
		spawnMain.operatingSystemPrint(soo, placeInfo2);
		
	}
}
