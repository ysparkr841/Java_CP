/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stArr = new String[] {"Park", "Kim", "No", "choi"};
		int i;
		for(i=0;i<stArr.length;i++) {
			System.out.printf("stArr[%d] = %s\n", i, stArr[i]);
		}
		//주소를 직접 찍어보자
		System.out.println(stArr);
		
		String[] tmp = new String[stArr.length+2];
		
		for(i=0;i<stArr.length;i++) {
			tmp[i] = stArr[i];
		}
		
		//주소를 직접 찍어보자
		System.out.println(tmp);
		
		//예상: String의 초기화 값은 null이기 때문에, 0~3의 인덱스 내부에는 각각의 값이 입력되고, 늘어난 두개의 인덱스는 null값을 가질 것임
		System.out.println();
		
		stArr = tmp;
		for(i=0;i<stArr.length;i++) {
			System.out.printf("stArr[%d] = %s\n", i,stArr[i]);
		}
		
		//변경된 주소를 직접 찍어보자
		System.out.println(tmp);
		//실행때마다 주소가 바뀌겠지만, tmp의 주소값과 마지막 stArr의 주소값이 같음. 동일한 메모리를 바라보고 있음
	
		for(i=0;i<stArr.length;i++) {
			if(stArr[i] == null) {
				stArr[i] = "빈 공간";
			}
			System.out.printf("stArr[%d] = %s\n", i, stArr[i]);
		}
	}

}
