/**
 * 
 */
package test1019;

/**
 * @author user
 *
 */
public class Sample1019_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//배열의 배열명은 그 배열의 시작 주소를 가리킨다.
		int[] score = new int[5];
		int k = 1;
		int i;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		
		int tmp = score[k+2] +score[4];
		
		//.length는 메소드가 아님. 배열은 내부적으로 배열의 크기를 갖고 있음 그 크기가 length임
		for(i=0;i<score.length;i++) {
			System.out.printf("score[%d] : %d \n", i, score[i]);
		}
		System.out.printf("tmp의 값 = %d\n", tmp);
		//아래는 오류가 남. 왜? score[5]는 없음. 할당받지 않음. 오류가 안나게 하려면, 애초에 int[] score = new int[6];으로 사이즈를 늘렸어야 함. 
		//ArrayIndexOutOfBoundsException는 인덱스 설정의 오류면 이렇게 나옴. 기억해 줄 것. 예외처리에서 본 문장임.
		//System.out.printf("score[5] \n", score[5]);
	}

}
