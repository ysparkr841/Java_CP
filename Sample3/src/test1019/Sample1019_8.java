/**
 * 
 */
package test1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1019_8 {

	/**
	 * 문제) 배열명 iArr1, iArr2로 선언하고, 크기는 10으로 정의합니다.
	 * 		iArr1크기 만큼 숫자를 입력받아 대입 후, iArr1의 값을 차례대로 출력하고
	 * 		iArr1의 내용을 iArr2 배열로 for을 사용하여 값을 대입 후 iArr2 배열 값을 차례로 출력하는 프로그램
	 * 
	 * 입력 예) iArr1 배열의 값을 입력하세요.> 10 20 30 40 50 60 70 80 90 95
	 * 출력 예) iArr1[0] = 10 
	 * 		  iArr1[1] = 20
	 * 			.....
	 * 		  iArr1[9] = 95
	 * 
	 * 			iArr2[0] = 10
	 * 			...
	 * 			iArr2[9] = 95
	 */
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("iArr1 배열의 값을 입력하세요.(10개)> ");
		int i;
		for(i=0;i<iArr1.length;i++) {
			iArr1[i]=sc.nextInt();
		}
		for(i=0;i<iArr1.length;i++) {
			System.out.printf("iArr1[%d] = %d\n", i, iArr1[i]);
			
			//iArr2[i] = iArr1[i]; 순서가 같아서 아래 for문 없애고 이렇게 넣어도 됨.
		}
		System.out.println();
		
		for(i=0;i<iArr2.length;i++) {
			iArr2[i] = iArr1[i];
		}
		
		for(i=0;i<iArr2.length;i++) {
			System.out.printf("iArr2[%d] = %d\n", i, iArr2[i]);
		}
		
		System.out.println("==============구분==============");
		
		//반대로 찍어보자!
		int[] iArr3 = new int[10];
		int j=0;
		
		//역순 입력
		for(i=(iArr1.length-1);i>=0;i--) {
			iArr3[j] = iArr1[i];
			j=j+1;
		}
		//출력
		for(i=0;i<iArr3.length;i++) {
			System.out.printf("iArr3[%d] = %d\n", i, iArr3[i]);
		}
		System.out.println("==============구분==============");

		//2차
		int[] iArr4 = new int[10];
		
		//for문 안에 조건식은 1개여야 하지만, 증감식과 초기값 주는 부분은 ,로 구분하여 여러개 가능.
		for(i=(iArr1.length-1),j=0;i>=0;i--,j++) {
			iArr4[j] = iArr1[i];
		}
		for(i=0;i<iArr4.length;i++) {
			System.out.printf("iArr4[%d] = %d\n", i, iArr4[i]);
		}
		
		
		System.out.println("==============구분==============");
		//홀수 배열만 넣어보자
		int[] iArr5 = new int[5];
		for(i=0,j=0;i<=iArr1.length;i++) {
			if(i%2==0) {continue;}
			iArr5[j] = iArr1[i];
			j++;
		}
		System.out.println("iArr1배열의 홀수번째 값만 iArr5에 넣은 값.> ");
		for(i=0;i<iArr5.length;i++) {
			System.out.printf("iArr5[%d] = %d\n", i, iArr5[i]);
		}
}
}
