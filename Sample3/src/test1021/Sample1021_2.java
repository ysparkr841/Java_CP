/**
 * 
 */
package test1021;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1021_2 {

	/**
	 * 5. 연도와 월을 입력받아 해당 월의 날 수를 출력하다가 월이 0 이면 종료하는 프로그램
			(단, 월이 잘못 입력되면 “잘못 입력하였습니다.” 출력)
			우선 윤년인지 평년인지 알아야 함. 무한루프 월이 0이 입력되면 종료
			입.출력예) 년 = 2000
          	월 = 2
          	입력하신 달의 날 수는 29일입니다.
 
          	년 = 2010
          	월 = 13
          	잘못 입력하였습니다.

          	년 = 0
          	월 = 0

힌트)int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; -> 인데스 값의 1의 값과 1월이 매치되게 첫 값을 0으로 주는 것.
    int year, month;
    System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", 
                                                      days[month]);
    #윤년계산 : 1. 400년 마다 %400 == 0 -> 윤년
                2. 4년 마다 오면서 100년은 제외 %4==0 && year %100 != 0
	=> 29일
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int inputY, inputM;
		while(true)
		{
			System.out.print("년 = ");
			inputY = sc.nextInt();
			System.out.print("월 = ");
			inputM = sc.nextInt();
			if(inputM == 0) 
				break;
			else if(inputM>12 || inputM<0) 
			{
				System.out.println("잘못 입력하셨습니다.");
				
			}else
			{
				if(inputY%400 == 0 ) 
				{
					days[2] = 29;					
				}
				else if(inputY%4 == 0 && inputY%100 !=0) 
				{
					days[2] = 29;
				}
				else {
					days[2] = 28;
				}
				System.out.println("입력하신 달의 날 수는 "+days[inputM]+"입니다.");
				//얘가 else로 묶여있으면 continue 필요가 없음
			}
			
			days[2] = 28;
		}
		String str;
	}

}
