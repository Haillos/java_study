package study.Iter;

public class Iteration01 {

	public static void main(String[] args) {

		/*
		 * 반복문 예시 int sum = 0;
		 * 
		 * for (int i = 1; i <= 100; i++) { sum = sum + i; } System.out.println("합계 : "
		 * + sum);
		 * 
		 */

		//

		System.out.println("월요일"); // 반복하려면 여러번 써야함
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");

		System.out.println("=====================================");

		for (int i = 1; i <= 10; i++) { // i가 증감을 통해 10이 될때 까지 사이에 있는 문장 반복
			System.out.println("월요일");
		}

		// int i = 3;

		for (int i = 35; i < 45; i++) { // for 문이 하나의 지역
			System.out.println("수요일");
		}

		for (int j = 1; j <= 5; j++) {
			System.out.println("오늘은 공부 " + j + " 일차 !");
		}

		
		
		int sum = 0; // 덧셈 연산할 때는 영향이 없기 때문에 0으로 설정

		for (int n = 10; n <= 100; n = n + 10) {
			sum = sum + n;
		}
		System.out.println("10~100까지(10단위) 합 : " + sum);
		
		// n : 1  2  3  4  5  6  7  8  9  10
		//     10 20 30 40 50 60 70 80 90 100
		
		sum = 0;
		
		for(int n=1; n<=10; n++) {
			sum = sum + (n*10);
		}
		System.out.println("10~100까지(10단위) 합 : " + sum); 
		 // 합이 1100인 이유는 앞의 550의 결과에 더해져서 그렇다. sum = 0; 으로 해당 for문의 결과만 출력 가능
		
		for(int k=2; k<20; k=k*2) {
			//k : 2 4 8 16 
		}
		
		for(int k=400; k>100; k=k-50) {
			//k : 400 350 300 250 200 150
		}
		
		for(int k=100; k>=90; k--) {
			//k : 100 99 98 97 96 95 94 93 92 91 90 89
		}
		

	}

}
