package test1021;

public class TVSample_2 {

	public static void main(String[] args) {
		/*실행결과) t1의 채널값은 0입니다.
		 * 			t2의 채널값은 0입니다.
		 * 			t1의 채널값은 7로 변경합니다.
		 * 			t1의 채널값은 7입니다. 
		 * 			t2의 채널값은 7입니다. <-t1과 t2가 같은 곳을 바라보게 하겠다는 의미.
		*/  
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
		
		System.out.println("t1의 채널값을 7로 변경합니다.");
		t1.channel = 7;
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		
		
		
		t2 = t1;
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
		
		//이 상황에서 t2.channel의 값을 변경하면? t1.channel은?
		//당연히 같은 집을 바라보게 되었으니, 값도 동일하게 나옴.
		t2.channelUp();
		t2.channelUp();
		//t2.channel의 값이 2 상승시키고 아래의 결과 확인
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		
		
		//메소드로 채널 바꿔보기.
		System.out.println("===================================");
		System.out.println("t1의 채널값을 7로 변경합니다.");
		t1.channelChoice(7);
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		
		t1.channelChoice(112);
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		
		t1.channelChoice(335);
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		

	}

}

