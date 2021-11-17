/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//메소드로 배열 복사해보자
		char[] abc = {65,66,67,68};
		//여기 65는 char타입이기때문에 아스키코드로 A가 들어감. 65-A 97-a;
		char[] num = {'1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열로 만든다
		
		char[] result = new char[abc.length+num.length];
		
		int i;
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		//시작주소, 0번째꺼를, 결과의 0번째 인덱스부터 복사. 길이는 abc배열의 길이만큼;
		//앞의 두개는 복사할 대상, 뒤에 두개는 붙여넣을 대상, 0번째 인덱스부터 복사해서, 0번쨰 인덱스에 넣는데, 그 길이는 abc.length까지. 아마
		//arraycopy 메소드에 보면 <abc.length로 되어있을 것.
		/*for(i=0;i<abc.length;i++) {
			result[i] = abc[i];
		} 이 반복문과 같음.
		*/
		System.arraycopy(num, 0, result, abc.length, num.length);
		//인덱스를 지칭하는 거기 때문에, abc.length부터 넣어주면 됨, 왜? index보다 length는 1많으니까.
		//이어서 붙여주는 것.
		System.out.println(result);
		
	}

}
