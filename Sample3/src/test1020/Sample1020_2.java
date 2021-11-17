/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*배열 복사
		* 출력결과)[변경전]
		* 		arr.length : 5
		* 		arr[0] = 1
		* 		arr[1] = 2
		* 		arr[2] = 3
		* 		arr[3] = 4
		* 		arr[4] = 5
		* 
		* 		[변경후]
		* 		arr.length : 10
		* 		arr[0] = 1
		* 		arr[1] = 2
		* 		arr[2] = 3
		* 		arr[3] = 4
		* 		arr[4] = 5
		* 		arr[5] = 0
		* 		arr[6] = 0
		* 		arr[7] = 0
		* 		arr[8] = 0
		* 		arr[9] = 0
		*  선언과 동시에 배열의 크기가 정해진다는 단점을 보완하기 위한 것: 배열 복사
		*/
		
		int[] arr = new int[5];
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		System.out.println("[변경전]");
		System.out.printf("arr.length : %d \n", arr.length);
		
		for(i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] = %d \n", i, arr[i]);
		}
		
		//임시 배열, arr의 두배크기로 생성
		int[] tmp = new int[arr.length *2];
		
		//배열의 값 복사
		for(i=0;i<arr.length;i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
		//주소값을 일치시킴. arr의 주소가 tmp의 주소와 같아짐. 그러면, arr가 가리키는 부분이 달라짐
		//참조형 변수는 java에서 알아서 초기화 시켜줌. arr이라는 배열명의 초기값은 null임 그 다음엔 주소가 들어감.
		//java의 garbage collection이 알아서 사용하지 않는 데이터를 지우기 때문에, 기존의 데이터들은 어느 시점에 삭제됨.
		
		System.out.println("[변경후]");
		System.out.printf("arr.length : %d \n", arr.length);
		
		for(i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] = %d \n", i, arr[i]);
		
		}
		
		//tmp와 arr이 같은 곳을 바라보는지 확인하자.
		tmp[3] = 33;
		System.out.printf("arr[3] = %d \n", arr[3] );
		
		arr[9] = 99;
		System.out.printf("tmp[9] = %d \n", tmp[9]);
		
		System.out.println("\n");
		
		for(i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] = %d\t", i,arr[i]);
		}
		System.out.println();
		for(i=0;i<tmp.length;i++) {
			System.out.printf("tmp[%d] = %d\t", i,tmp[i]);
		}

	}

}
