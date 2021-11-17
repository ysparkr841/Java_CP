/**
 * 
 */
package Prac1019;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class Prac1019_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 입력예)
		 * 1,2,3,4,5,6,7,8,9,10
		 * [3,6,8,10,1,3,5,7]
		 * [100,95,80,70,60]
		 * [a,b,c,d]
		 * [I@132132
		 * 	abcd
		 *
		 *
		 */
		
		int[] pracArr = new int[10];
		int i,j;
		for(i=0; i<pracArr.length;i++) {
			pracArr[i] = i+1;
			System.out.print(pracArr[i]);
			if(i== (pracArr.length-1)) break;
			System.out.print(",");
		}
		System.out.println();
		System.out.println("========랜덤값 집어넣기======");
		int[] pracArr2 = new int[10];
		for(i=0;i<pracArr2.length;i++) {
			pracArr2[i] = (int)(Math.random()*10)+1;
			System.out.print(pracArr2[i]);
			if(i==(pracArr2.length-1)) break;
			System.out.print(",");
		}
		System.out.println();
		
		System.out.println("========Arrays.toString()메소드 사용해보기======");
		int[] pracArr3 = new int[] {100, 90, 80, 70, 60};
		System.out.println(Arrays.toString(pracArr3));
		
		System.out.println();
		char[] pracCharArr = new char[] {'a','b', 'c', 'd'};
		System.out.println(Arrays.toString(pracCharArr));
		
		System.out.println("========배열명 바로 출력해보기======");
		System.out.println("배열의 주소: "+pracArr);
		
		String[] pracStArr = new String[5];
		for(i=0, j=1; i<pracStArr.length;i++,j++) {
		pracStArr[i] = "사람"+j+""; 
		}
		System.out.println(Arrays.toString(pracStArr));
	}

}
