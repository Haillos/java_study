package study.Practice;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		int num = -3;
		System.out.println((num < 0 ) ? "음수" : (num == 0) ? "0" : "양수"); // 1
		
		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		
		int result1 = x + y;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstNum = scanner.nextInt(); // 다음 정수 스캔 하여 int 선언
		System.out.println("입력한 숫자 : " + firstNum);
		
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondNum = scanner.nextInt();
		System.out.println("입력한 숫자 : " + secondNum);
		
		System.out.println("더하기 : " + firstNum + " + " + secondNum + " = " + (firstNum + secondNum)); 
		
		System.out.printf("빼기 : %d - %d  = %d \n" , firstNum , secondNum , firstNum - secondNum );
		System.out.printf("곱하기 : %d * %d  = %d \n" , firstNum , secondNum , firstNum * secondNum );
		System.out.printf("나누기 : %d / %d  = %.2f \n " , firstNum , secondNum , (double)firstNum / secondNum );
		// 정수형은 %d 실수형은 %f
	}
}
