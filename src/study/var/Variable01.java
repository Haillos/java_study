package study.var;

import java.lang.reflect.Method;

public class Variable01 {

	public static void main(String[] args) {

		// 변수 선언
		int number1; // 정수형 숫자 변수
		int floor; //선언만 한 상태

		int x, y, z;
		
		int score; //선언
		int point = 50; // 선언 + 값 저장 초기화
		
		score = 90;
		
		// level = 99; 선언하지 않은 변수명 사용 불가능
		
		//time = 16; 변수 선언 이전에 사용 XX
		int time;
		time = 16;
		
		int minute = time + 9;
		 			// 16 + 9
		// int myFloor = floor + 7; 값이 없는 변수 계산 불가	
		
		int totalScore =  point + point + point + score +score;
		
		System.out.println("출력합니다."); // "" 는 문자열
		System.out.println(totalScore); // sysout + Ctrl + Space
		System.out.println( totalScore + point);
							// 330     +  50  = 380
		System.out.println( totalScore );
		totalScore = totalScore + point ;
		
		x = 10;
		y = x;
		z = x + y;
		
		int a = 10;
		int b = 20;
		// 값을 서로 바꾸고 싶을 때
        /* 서로 값을 바꿀 수 없다
          a = b ; // a:20 b:20
          b = a ; // a:20 b:20 */
		
		int c = a; // a:10 b:20 c:10
		a = b;     // a:20 b:20
		b = c;     // a:20 b:10 c:10
		
	}
} 
