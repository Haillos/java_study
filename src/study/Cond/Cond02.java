package study.Cond;

public class Cond02 {

	public static void main(String[] args) {

		int dice = 5;

		if (dice == 1) {
			System.out.println("한칸 전진");

		}

		if (dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}

		if (dice == 1) {
		} else if (dice == 2) {
		} else if (dice == 3) {
		} else if (dice == 4) {
		} else if (dice == 5) {
		} else { // 마지막이 else if일 때 값이 벗어나면 그냥 지나가지만 else는 false를 산출한다.
		}
		// 조건에 충족하는 한 개를 실행하는 게 목적 이면 else if 사용 아닐시 if문 (충족되는 값이 나와도 아래 문장 진행 )

		System.out.println("================switch===================");
		dice = 4;
		switch (dice) {
		case 1: // dice == 1
			System.out.println("case 1");
			break;
		case 2: // dice == 2
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break; // 이후 케이스 진행 X
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		case 6:
			System.out.println("case 6");
			break;
		default: // 모든 케이스 실행 및 else 케이스에 맞지 않으면 디폴트 실행
			System.out.println("default");
		}

		// 8시 출근 : 청소
		// 9시 출근 : 회의
		// 10시 : 업무
		// 11시 : 퇴근

		int showTime = 9;

		if (showTime <= 8) {
			// 청소
		}
		if (showTime <= 9) {
			// 회의
		}
		if (showTime <= 10) {
			// 업무
		}
		if (showTime <= 11) {
			// 외근
		} // 모든 if 문 실행

		if (showTime <= 8) {
			// 청소
			// 업무 //위의 문장을 else if로 만들 시 사용하는 방법
			// 회의
			// 외근
		} else if (showTime <= 9) {
			// 회의 else if 여서 true면 진행 종료
			// 업무
			// 외근
		} else if (showTime <= 10) {
			// 업무
			// 외근
		} else if (showTime <= 11) {
			// 외근
		}
			switch (showTime) { // showTime을 모든 case에 대입 break가 있을 시 위의 else if 문처럼 작성 해야함
			case 8:
				// 청소
			case 9:
				// 회의
			case 10:
				// 업무
			case 11:
				// 야근
			}
				switch (showTime) { // showTime을 모든 case에 대입 break가 있을 시 위의 else if 문처럼 작성 해야함
				case 8:
					// 청소
					// 회의
					// 업무
					// 외근
					break;
				case 9:
					// 회의
					// 업무
					// 외근
					break;
				case 10:
					// 업무
					// 외근
					break;
				case 11:
					// 야근
					break;
				}

				int goBedTime = 21; // 잠든시간
				int sleepTime = 9; // 잔시간
				//일찍 많이/조금
				//늦게 많이/조금
				
				if (goBedTime <= 21) {
					// 일찍 잤구나
						if (sleepTime >= 9) {
						// 많이 잤구나
						} else {
						// 조금 잤구나
						}
				} else {
					// 좀 늦게 잤구나
						if (sleepTime >= 9) {
							// 많이 잤구나
						} else {
							// 조금 잤구나
					}	
					}
				
				// x == 10   x ! = 10 !(x == 10)
				// x < 10  의 반대는 x >= 10   !(x < 10)
				// x > 11 의 반대는 x<= 11     !(x > 11)
				
				if(goBedTime <= 21 && sleepTime >= 9) {
					// 일찍 많이
				} else if (goBedTime <= 21 && !(sleepTime >= 9) ) {
					// else if (goBedTime <= 21 && sleepTime < 9) {
					// 일찍 조금
				} else if (goBedTime > 21 && !(sleepTime >= 9) ) {
					// 늦게 많이
				} 
				
				char grade = 'B';
				switch(grade) {
				case 'A' :
				case 'a' :
					System.out.println("1");
				case 'B' :
				case 'b' :
					System.out.println("2");
				case 'C' :
				case 'c' :
					System.out.println("3");
				case 'D' :
				case 'd' :
					System.out.println("4");
					break;
					default :
						System.out.println("5");

	
	
	
	
	
	}
	
				
}

}
