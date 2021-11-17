package sample1029_Interface;


//요건 수업 전에 내가 스스로 해 본 것!


public class OsMain {

	public static void main(String[] args) {
		//AmdRadeon 객체 생성 시, 반드시 모델명과 메모리를 줘야 함.
		AmdRadeon ar = new AmdRadeon("A1", 8);
		
		//PointColor pc = new PointColor(); ->경우 사실상 x : 0, y : 0, RGB(0,0,0)으로 찍는 것과 동일.
		//OS입장에서는 "나는 x는 25, y는 25인 좌표에 색상 핑크색(RGB: 255, 203, 255)를 찍을거야."라는 것을 객체로 생성해서 넘겨주면
		//AmdRadeon클래스 객체로 write라는 메소드를 호출 할건데, 해당 메소드가 가져가는 것은 위에서 넣은 정보 pc.
		PointColor pc = new PointColor(25, 25, new RGB(255, 203, 255));
		ar.write(pc);
		
		
		System.out.println("============구분============");
		//이렇게도 가능할까? 시도
		ar.write(new PointColor(250, 300, new RGB(255, 0 , 0)));
		
		/*
		 * ar.write(pc);
		 * ar.write(new PointColor(250, 300, new RGB(255, 0 , 0)));
		 * 
		 * 이 두 차이는, 메소드를 호출할 떄 사용한 값이 저장되어서 또 사용할 수 있는지, 아니면 메소드 호출 후에 해당 영역은 더 이상
		 * 호출할 수 없는지의 차이다. 해당 new PointColor(250, 300, new RGB(255, 0 , 0))의 값이 담긴 참조변수가 없기 때문에
		 * 메소드 호출 후에 인스턴스 변수에 담긴 값은 사라진다.
		 */
		
		NvidiaGeForce ngf = new NvidiaGeForce("GTX", 1060);
		PointColor pcNgf = new PointColor(140, 250 , new RGB(255, 0 , 0));
		
		ngf.write(pcNgf);
		
		ngf.write(new PointColor(300, 400, new RGB(100,255,0)));
		
	}

}
