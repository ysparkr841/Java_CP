/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] num = new int[45];
		int i, j;
		
		//num배열에 각각 값을 대입.
		for(i=0;i<num.length;i++) 
		{
			num[i]=i+1;
		}
		
		for(i=0;i<lotto.length;i++) 
		{
			lotto[i] = num[(int)(Math.random()*45)];
			//중복제거
			//j=0일 때는 실행이 되지 않음. j<i의 조건에 부합하지 않기 때문.
			// 즉, 아래의 반복문은 lotto[0], lotto[1]에 값이 들어갔을 때부터 작동함.
			for(j=0;j<i;j++)
			{
				if(lotto[i] == lotto[j]) 
				{
					i--;
					break;//얘는 지금 속한 for를 나가서 밖의 for를 다시 반복함.
				}
			}
		}
		
		//출력
		for(i=0;i<lotto.length;i++) 
		{
			System.out.printf("lotto[%d] = %d\n", i, lotto[i]);
		}
	}

}
