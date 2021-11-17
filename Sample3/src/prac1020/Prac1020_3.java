/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//배열 이어붙이기
		char[] abc = new char[] {97,98,99,100,101};
		char[] def = new char[] {'1','2','3','4','5','6','7','8','9','A','B','C'};
		
		char[] result = new char[abc.length+def.length];
		
		/*
		 * System.arraycopy(abc, 0, result, 0, abc.length); 
		 * System.arraycopy(def, 0, result, abc.length, def.length);
		 */
		
		//method 만들어볼까?
		//배열을 복사해서 넣어주는 메소드를 만들었고 사용해보자.
		
		//우선 사용할 메소드가 있는 클래스 객체를 만들어주자.
		ArrayTestMethod atm = new ArrayTestMethod();
		atm.arrayTestMethod(abc, 0, result, 0, abc.length);
		atm.arrayTestMethod(def, 0, result, abc.length, def.length);
		
		//char타입 배열만 2차배열느낌으로 바로 println으로 사용 가능함. 
		System.out.println(result);
		System.out.println();
		
		//system.arraycopy의 구조가 궁금하다면, 아래 메소드를 보면 될 듯, 완벽하게 일치하지는 않겠지만, 저런 구조이기 때문에 위처럼 대입하는 것.
		//실제로는 어떤 타입의 데이터를 받을 수 있는 배열일지 모르니, 여러 타입의 배열을 받을 수 있게 오버로딩되어 있거나, 더 범위가 넓은 구조로 받을 수 있게 
		//되어 있을 것. 그래도, 어떻게 넣어야되는지 알 수 있는 차원에서 참고해도 좋을 듯 함.
		
		int[] iArr = new int[5];
		int[] iArr2 = new int[7];
		int i;
		for(i=0;i<iArr.length;i++) {
			iArr[i] = 40+ i*5;
		}
		
		for(i=0;i<iArr.length;i++) {
			iArr2[i] = iArr[i]+10;
		}
		
		int[] sumArr = new int[iArr.length+iArr2.length];
		atm.arrayTestMethod(iArr, 0, sumArr, 0, iArr.length);
		atm.arrayTestMethod(iArr2, 0, sumArr, iArr.length, iArr2.length);
		
		for(i=0;i<sumArr.length;i++) {
		System.out.printf("sumArr[%d] = %d\n", i, sumArr[i]);
		}
	}

}

class ArrayTestMethod{
	
	//주소값을 받았기 때문에, 해당 주소값을 받아서 그 인덱스의 값들을 변경하면, 메소드로 보낸 배열명의 인덱스 내부 값도 같아짐. 
	//사실상 같아진게 아니라, 같은 곳을 보고 있기 떄문에 메소드 내부에서 바뀐 값을 굳이 다시 넣어주지 않아도 되는 것.
	
	void arrayTestMethod(char[] abc, int a, char[] result, int b, int c ) {
		
		for(int i = a, j = b;i<c;i++,j++) {
			result[j] = abc[i];
		}
	}
	
	//아래처럼 굳이 int i와 int j를 넣지 않아도 될 듯. 굳이 변수를 또 따로 잡지 않아도 되기 때문에 하단의 방법이 좋을 듯 함.
	//그러나 위의 방법도 남겨 놓는 이유는 이해하기 편하기 때문이니, 만약 다음에 작성 시에는, 아래의 방법이 낫지 않을까 함.
	void arrayTestMethod(int[] abc, int a, int[] result, int b, int c) {
		for(; a < c; a++, b++) {
			result[b] = abc[a];
		}
	}
	
}
