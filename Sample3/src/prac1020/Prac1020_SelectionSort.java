/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_SelectionSort {

	/**
	 * 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램을 작성
		출력예) 50 75 85 95 100
	 */
	public static void main(String[] args) {
		//selection sort 처음부터 구성해보자.
		int[] iArr = new int[] {95,85,76,33,46,98,76,53,41,97,65,34};
		int i, j, least, tmp;
		
		for(i=0;i<iArr.length-1;i++) 
		{
			least = i;
			for(j=i+1;j<iArr.length;j++) 
			{
				if(iArr[least]>iArr[j]) 
				{
					least = j;
				}
			}
			
			if(i != least)
			{
				tmp = iArr[i];
				iArr[i] = iArr[least];
				iArr[least] = tmp;
			}
		}
		
		for(i=0;i<iArr.length;i++)
		{
			System.out.printf("iArr[%d] = %d\n", i, iArr[i]);
		}
	}

}
