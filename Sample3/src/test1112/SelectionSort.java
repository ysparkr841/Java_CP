package test1112;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * 문제 정수를 입력 받아 오름차순으로 정렬하는 프로그램
		 * 입력예: 50 65 55 35 30 75 70 25 20 80 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int i, tmp, tmpIndex, j;
		int[] intArr = new int[10];
		System.out.print("숫자를 입력해주세요: ");
		for(i = 0; i<intArr.length;i++) 
		{
			intArr[i] = sc.nextInt();
		}
		
		for(i=0; i<intArr.length-1; i++) 
		{
			tmpIndex = i;
			for(j=i+1;j<intArr.length;j++) 
			{
				if(intArr[tmpIndex]> intArr[j]) 
				{
					tmpIndex = j;
				}
			}
			
			if(i != tmpIndex) 
			{
				tmp = intArr[i];
				intArr[i] = intArr[tmpIndex];
				intArr[tmpIndex] = tmp;
			}
		}
		
		for(i = 0; i<intArr.length; i++) 
		{
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
		
	}

}
