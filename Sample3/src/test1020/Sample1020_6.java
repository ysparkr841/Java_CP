/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_6 {

	/**
	 * 3. 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램을 작성
			출력예) 50 75 85 95 100

	 		선택정렬, for문의 for문임.  95부터 100까지가 i는 length-1부터 , j=i+1부터
	 */
	public static void main(String[] args) {
		int[] num = new int[] {95,75,85,100,50};
		int i,j, tmp;
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				//교환할 인덱스 값만 확보
				if(num[i]>num[j]) {
				tmp = num[i];
				num[i] = num[j];
				num[j] = tmp;
				}
				//여기서 교환 -> [i]의 값과 [교환할 인덱스 위치의 값]과 교환
			}
		}
		//select sort는 위의 방식대로 굴러가긴 하는데, 위치의 값들을 계속 바꾸지는 않음.
		//그냥 위치 값의 j값을 기억하고 있다가 더 낮은 값이 있으면 계속 변경,
		//그러다가 i에 j를 대입.
		for(i=0;i<num.length;i++) {
			System.out.printf("%d ", num[i]);
		}
	}

}
