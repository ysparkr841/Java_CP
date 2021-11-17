/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_6 {

	/**
	 * 3. 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램을 작성
		출력예) 50 75 85 95 100
	 */
	public static void main(String[] args) {
		int[] num = new int[] {95,75,85,100,50};
		int j, i, tmp;
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
