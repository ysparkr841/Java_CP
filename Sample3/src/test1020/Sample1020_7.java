/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_7 {

	/**
	 * 4. 로또번호 발생기
	길이가 45인 배열에 1~45까지의 값을 담은 다음 반복문을 이용해서 배열의 인덱스가 1인(인덱스 [0]) 값과 random()에 의해서 결정된 임의의 위치에 있는 값과 자리를 바꾸는 것을 
	6번 반복하여 앞 6개의 배열 값을 출력하는 프로그램
	
	출력예) ball[0] = 40
       ball[1] = 12
       ball[2] = 19
       ball[3] = 39
       ball[4] = 29
       ball[5] = 3                   --실행시마다 결과 다름   
	 */
	public static void main(String[] args) {
		int[] ball = new int[45];
		int i,tmp, a;
		for(i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		for(i=0;i<=100;i++) {
			a = (int)(Math.random()*45);
			tmp = ball[0];
			ball[0] = ball[a];
			ball[a] = tmp;
		}
		for(i=0;i<6;i++) {
		System.out.printf("num[%d] = %d\n", i, ball[i]);
		}
	}

}
