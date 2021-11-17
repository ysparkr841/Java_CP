/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_5 {

	/**
	 * 2. 길이가 10인 배열 iArr을 생성하고 0~9의 숫자로 차례대로 초기화하여 출력 한후 random()을 이용해서 배열의 임의의 위치에 있는 값과 배열의 첫 번째 요소인 iArr[0] 의 값을 교환하는 일을 
			100번 반복하다가 끝낸후 iArr배열을 출력하는 프로그램
			출력예) 0123456789
       			5827164930 --이부분은 random 인덱스와 [0] 번째 값 
                   				--교환으로 실행시마다 다른 결과 출력
	 */
	public static void main(String[] args) {
		int[] iArr = new int[10];
		int i;
		for(i=0;i<iArr.length;i++) {
			iArr[i]= i;
			System.out.printf("%d", iArr[i]);
		}
		System.out.println();
		int tmp, a;
		for(i=0;i<=100;i++) {
			tmp = iArr[0];
			a= (int)(Math.random()*10);
			iArr[0] = iArr[a];
			iArr[a] = tmp;
		}
		
		for(i=0;i<iArr.length;i++) {
			System.out.printf("%d", iArr[i]);
		}
		
	}

}
