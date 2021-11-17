package GameTestPrac1029;

public class GameMain {

	public GameMain(Game game) 
	{
		if(game != null) 
		{
			if(game instanceof Poe) 
			{
				System.out.println("======Path of Exile======");
			}else if(game instanceof Outward) 
			{
				System.out.println("=========Outward=========");
			}else if(game instanceof LOL) 
			{
				System.out.println("===========LOL===========");
			}else 
			{
				System.out.println("정의되어 있지 않습니다.");
			}
			
			System.out.println("이름 : "+game.getName());
			System.out.println("캐릭터명 : "+game.getChaN());
			System.out.println("레벨 : "+game.getLv());
			System.out.println("배급사 : "+game.getDis());
			
		}
	}
	
	public static void main(String[] args) 
	{
		Poe poe = new Poe("Path of Exile");
		poe.print();
		
		Outward outward = new Outward("Outward");
		outward.print();
		
		LOL lol = new LOL("League of Legend");
		lol.print();
		
		System.out.println("=============개별 값 변경===============");

		poe.setChaN("DduFlicker");
		poe.print();		
		
		outward.setLv(0);
		outward.print();
		
		lol.setDis("Riot Games");
		lol.print();
		
		System.out.println("============================================");
		
		GameMain gm = new GameMain(poe); //생성자를 통해 바로 출력, 전에는 메소드로 출력함.
		GameMain gm2 = new GameMain(outward);
		GameMain gm3 = new GameMain(lol);
		
		
	}

}
