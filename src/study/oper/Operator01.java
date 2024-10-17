package study.oper;

public class Operator01 {
	public static void main(String[] args) {

		System.out.println(1 + 1);
		System.out.println(9 - 4);
		System.out.println(3 * 1);
		System.out.println(7 / 3.0);
		System.out.printf("%.2f\n", 7 / 3.0);// 정수.표현할소수점자리f
		System.out.println(9 % 5);

		// 부호
		System.out.println(10);
		System.out.println(-10);
		System.out.println(+10);

		System.out.println("========================================");
		// 증감연산자
		int x = 10;
		System.out.println(++x); // x+1
		System.out.println(--x); // x-1

		System.out.println(x++); // ++변수 +를 먼저 | 변수++ +를 나중에

		int y = 20;
		System.out.println(++y); // 20에서 21로 바뀜.
		System.out.println(y);

		int z = 30;
		System.out.println(z + 1); // 30+1
		System.out.println(z); // 값 유지

		int q = 1;
		int w = 3;
		int e = 10 + ++q; // 10 + 2
		int r = 3 + w--; // 3 + 3 = 6 → w---

		System.out.printf("%d %d %d %d\n", q, w, e, r);

		boolean isFinished = false;
		System.out.println(!isFinished);
		System.out.println(isFinished);
		// isSleep 자고있나? true !isSleep 안자고있나? false

		System.out.println("=========================================");

		// 비교
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(3 < 5);
		System.out.println(4 <= 4);
		System.out.println(5 > 10);
		System.out.println(9 >= 8);
		boolean b1 = (9 >= 8);

		// 논리
		boolean b2 = (10 > 6) && (10 > 5);
		// true and true → true
		System.out.println(b2);

		boolean b3 = (5 != 1) || (10 < 4);
		// true or false → true
		System.out.println(b3);

		boolean b4 = (2 >= 1) && (3 < 4);
		System.out.println(!b4); // !로 반대논리

		// 대입
		int a = 30;
		
		a += 30; // a = a + 30;
		a -= 5; // a = a - 5;
		a *= 3; // a = a * 3 ;
		a /= 2; // a = a / 2;
		a &= 4; // a = a % 4;
		
		// 가독성을 위해 풀어쓰기도 한다. 
		
		// 삼항
		int point = 300;
	
		// 0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		
		String eventItem = (point <= 200) ? "생수" : "커피" ;
		System.out.println(eventItem);
		
		eventItem = ( point > 200 ) ? "커피" : "생수";
		
		// 0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		// 301 ~ : 맥주
		
		eventItem = ( point > 200 ) ? (point > 300 ? "맥주" : "커피") : ( point >= 0 ? "생수" : "사은품 없음");
		System.out.println(eventItem);
		//         point가 200보다 크나 작나 ?    클 시 300 보다 크면 맥주 아니면 커피  포인트가 0과 같거나 크면 생수 아니면 사은품 없음  
		eventItem = ( point > 200 ) ? ( (point >= 201 && point <= 300) ? "맥주" : "커피") : "생수";
					//                        false

		// (point >= 0 && point <= 200 )
	}

}
