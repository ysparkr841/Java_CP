/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class SelectionSort {

	/**
	 * 3. 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램을 작성
			출력예) 50 75 85 95 100

	 		선택정렬, for문의 for문임.  95부터 100까지가 i는 length-1부터 , j=i+1부터
	 */
	public static void main(String[] args) {
		int[] iArr=new int[] {95, 75, 85, 100, 50};
		
		int i,j,tmp,indexTemp =0;
		
		for(i=0;i<iArr.length-1;i++) {
			indexTemp = i;
			//indexTemp에 i 값을 넣어줘서 indexTemp와 j의 값을 비교해야 함.
			//왜냐하면, i는 밑에서 넣어줄 때 필요한 것이고, 지금은 실제로 값을 바꾸는 이동은 하지 않고, 
			//indexTemp의 위치값만 기억하려고 하는 것이기 때문.
			//즉, indexTemp가 i의 값일 때, j보다 크다 그러면 그 인덱스 값을 기억하고 있는 것. 위치는 움직이지 않음.
			//예를 들어보자. i=0일 때, indexTemp도 0이겠지? 그러면, j=1, 그러면 iArr[0]과 iArr[1]을 비교함. 95랑 75를 비교
			//크면 indexTemp = 해당 값인 j를 넣음.
			//그러면 indexTemp = 1이 되겠지?
			//j는 다시 증가해서 2가 됨. iArr[indexTemp]>iArr[j] -> 결국 iArr[1]과 iArr[2]를 비교, 성립하지 않음.
			//indexTemp는 아직 1. j는 이제 3.
			//iArr[indexTemp]>iArr[j] -> 75와 100을 비교-> 아직 조건만족 x  indexTemp는 아직도 1;
			//j는 이제 4가 됨. iArr[indexTemp]>iArr[j]-> 75와 50을 비교. 만족, indexTemp는 4가 됨.
			//자 그러면 이제 진짜 값을 바꿔야됨.
			//tmp에 iArr[i]값을 넣음. 여기선 95겠죠. tmp값이 95가 됨.
			//iArr[i]의 값은 iArr[indexTemp]의 값인 50이 됨.
			//iArr[indexTemp]는 temp의 값인 95받음.
			//for문 한번 돌렸을 때, 50 75 85 100 95가 됨.
			
			for(j=i+1;j<iArr.length;j++) {
				if(iArr[indexTemp]>iArr[j]) {
					indexTemp = j;
				}
			}
			if(i != indexTemp) 
			{
				tmp = iArr[i];
				iArr[i] = iArr[indexTemp];
				iArr[indexTemp] = tmp;
			}
			
		}
		for(i=0;i<iArr.length;i++) {
		System.out.printf("%d ", iArr[i]);
		}
	}

}
