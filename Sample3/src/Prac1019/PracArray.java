/**
 * 
 */
package Prac1019;

/**
 * @author user
 *
 */
public class PracArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//배열 선언
		int ages[];
		String names[];
		
		
		//배열 생성
		ages = new int[3];
		names = new String[3];
		
		ages[0] =1;
		ages[1] =2;
		ages[2] =3;
		names[0] = "홍길동";
		names[1] = "전우치";
		names[2] = "이도";
		int i;
		for(i=0;i<3;i++) {
			System.out.println("ages["+i+"]의 값은 : "+ages[i]);
			System.out.println("names["+i+"]의 값은 : "+names[i]);
		}
		
		int num = 3;
		int arrayOne[] = new int[3];
		for(i = 0;i<3;i++) {
			arrayOne[i]= ++num;
		}
		for(i=0; i<3;i++) {
			System.out.println("arrayOne["+i+"]의 값은 : "+arrayOne[i]);
		}
	}

}
