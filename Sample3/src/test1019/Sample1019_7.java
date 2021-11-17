/**
 * 
 */
package test1019;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class Sample1019_7 {

	/**
	 * 입력예)
	 * 1,2,3,4,5,6,7,8,9,10,
	 * [3,6,8,10,1,3,5,7]
	 * [100,95,80,70,60]
	 * [a,b,c,d]
	 * [I@132132
	 * 	abcd
	 *
	 *
	 */
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95 , 80 , 70 ,60};
		//int[] iArr3 = {100, 95 , 80 , 70 ,60}; 이렇게 써도 됨.
		char[] chArr4 = {'a', 'b', 'c', 'd'};
		
		int i;
		for(i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1;
		}
		
		for(i=0;i<iArr2.length;i++) {
			iArr2[i]= (int)(Math.random()*10)+1;// 1~10까지라서 +1
		}
		
		for(i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
		}
		
		
		System.out.println();
		
		//배열의 값들을 보여주는 메소드. 근데 이건, String으로 되는 것 아닌가?
		//내용만 보는 것.
		
		//Arrays는 클래스명, Arrays.toString()은 메소드 안의 iArr2는 배열명이 가진 주소값을 넘겨주는 것.
		//넘길때 넘어가는 것은 안에 있는 주소값이 넘어가는 것, 즉, iArr2이라는 변수명이 가는게 아니라 iArr2의 내부에 있는 주소값이 넘어감.
		//메소드를 사용할 때 인자가 변수로 넘어가면, 변수의 값을 넘겨줌, 예를 들어 a=5인데 a를 넘기면 a가 넘어가는 것이 아니라 
		//새로 받는 매개변수x에 5의 값을 보냄.
		//그러면 x와 a가 가리키는 주소가 같나? no! 값이 넘어가는 것이기 때문에 5만 넘어가는 것.
		//메모리 영역에 a의 영역과 x의 영역이 따로 생기는 것. 그냥 그 a와 x가 가지는 값이 같은 것임.
		//즉, 배열이라면 x와 a가 같은 집을 바라보는데, 그냥 일반 변수가 간다면, 다른 집임.
		
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr4));
		//그냥 바로 찍어봄. 주소값임. 값은 매번 바뀜.
		
		System.out.println(iArr3.toString());
		
	}

}
