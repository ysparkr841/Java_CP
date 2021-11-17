/**
 * 
 */
package Prac1019;

/**
 * @author user
 *
 */
public class Prac1019_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodGather mg = new MethodGather();
		int a = 5;
		System.out.printf("int a의 값은 %d입니다.\n", a);
		mg.methodP(a); 		//methodP에 a 값을 넘김
		System.out.printf("int a의 값을 다시 출력합니다. int a의 값은 %d입니다.\n", a);
		//메소드를 출력하고 나서, a의 값은 변하지 않음. 즉, a를 넘긴 것이 아니라, a가 가진 값을 넘긴 것!
		/*
		 * 결과:
		 * 		int a의 값은 5입니다.
		 * 		int x의 값은 6입니다.
		 * 		int a의 값을 다시 출력합니다. int a의 값은 5입니다.
		 * 
		 * */
		
		//메모리 영역에 a의 영역이 생기고 그곳엔 5라는 값이 들어있고, 그 값인 5를 x로 넘긴 것, 
		//메모리 영역에 x의 영역이 새로 생기고, 해당 메소드가 종료되면
		//x의 영역은 사라짐. x는 methodP메소드 안에서 선언된 지역변수이기 때문
		//즉, a의 값은 변하지 않음, x의 값도 사라짐.
		
		System.out.println("====메소드로 배열명을 보내는 경우===============");
		
		int[] arrayOne = new int[3];
		int i;
		//배열은 객체이기 때문에, 선언과 동시에 컴파일러가 자동으로 초기화해줌. 초기값은 int이기 때문에 전부 0이 들어가 있음.
		//그래도 가시성을 높이기 위해 배열에 값을 넣어주자. 각각, 5, 10, 15를 넣어줌.
		arrayOne[0] = 5;
		arrayOne[1] = 10;
		arrayOne[2] = 15;
		//우선 메소드로 보내기 전 arrayOne 배열을 출력
		System.out.println("methodP(int[] y)로 arrayOne을 보내기 전 출력합니다.");
		for(i=0;i<arrayOne.length;i++) {
			System.out.printf("arrayOne[%d] = %d\n", i, arrayOne[i]);
		}
		
		System.out.println();
		
		System.out.println("arrayOne의 값을 받은 y배열을 출력합니다.");
		mg.methodP(arrayOne); //오버로딩한 methodP에 arrayOne의 값을 넘김
		//메소드를 보면 알겠지만, 각 인덱스가 가진 값마다 +1을 해주었음.
		
		System.out.println();
		for(i=0;i<arrayOne.length;i++) {
			System.out.printf("arrayOne[%d] = %d\n", i, arrayOne[i]);
		}
		/*
		 * 결과: 
		 * 		arrayOne[0] = 5
		 * 		arrayOne[1] = 10
		 * 		arrayOne[2] = 15
		 * 		y[0] = 6
		 * 		y[1] = 11
		 * 		y[2] = 16
		 * 		arrayOne[0] = 6
		 * 		arrayOne[1] = 11
		 * 		arrayOne[2] = 16
		 */
		
		//결과를 보면 알 수 있듯, methodP(arrayOne)으로 넘긴 값은, arrayOne이 가진 주소값이고, y도 역시 주소값을 가지고 있다.
		//이 때, y[0],y[1],y[2]의 값을 변경하면, 해당 주소를 찾아가서 그 안에 있는 값이 변경되는 것이기 때문에
		//arrayOne[0],arrayOne[1],arrayOne[2]의 값 역시 변경된다. 즉, arrayOne과 y가 가진 주소값은 동일한 집을 보고 있는 것.
		//y[0], y[1], y[2]의 값을 변경한다는 것은 그 주소가 가진 집 안의 내용을 바꾸는 것이고, 그와 주소를 가진 arrayOne의 
		//arrayOne[0], arrayOne[1], arrayOne[2]의 값도 동일하게 바뀐 값이 나오는 것.
		
		
	}

}

class MethodGather{
	
	//메소드 오버로딩으로 동일한 이름에 파라미터 변수 타입만 다른 메소드 methodP를 정의함
	void methodP(int x){
		x= x+1;
		System.out.printf("int x의 값은 %d입니다.\n", x);
	}
	
	void methodP(int[] y) {
		y[0] = y[0]+1;
		y[1] = y[1]+1;
		y[2] = y[2]+1;
		for(int i=0; i<y.length;i++) {
			System.out.printf("y[%d] = %d\n", i, y[i]);
		}
	}
	
}
