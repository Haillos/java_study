package study.Iter;

public class Iteration03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // i = 1 2 3 4 5

			/* 중첩 반복문
			i : 1
			j: 1 2 3 
			i : 2
			j: 1 2 3 
			i : 3
			j: 1 2 3 
			i : 4
			j: 1 2 3 
			i : 5
			j: 1 2 3 
			*/
			
			
			// 실행문
			System.out.println("for i 내부 실행문 시작" + i);
			for (int j = 1; j <= 3; j++) { // 똑같은 변수를 사용하면 위험
				System.out.println("for j 실행문" + j);
			}
			System.out.println("for i 내부 실행문 끝");
		}
			//방 3개
				//2번 쓸기
				//3번 닦고
				// 1번 쓰레기정리
			for (int i = 0; i<3; i++) {
				int j=1;
				while(j<=2) {
					System.out.println("쓸기");
					j++;
				}
				
				int k=1;
				while(k<=3) {
					System.out.println("닦기");
					k++;
				}
				
					System.out.println("쓰레기정리");
			}
				
		}
	}


