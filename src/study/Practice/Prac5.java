package study.Practice;

import java.util.Scanner;

public class Prac5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.print("숫자 입력 : "); int num = scanner.nextInt();
		 * 
		 * if (num < 0 ^ num > 24) { System.out.println("잘못입력하였습니다."); } if (num <= 12)
		 * { System.out.println("오전입니다."); } if (num <= 6) {
		 * System.out.println("이른 오전입니다."); } if (num <= 12 && num > 7) {
		 * System.out.println("늦은 오전입니다."); } if (num > 12 && num <= 24) {
		 * System.out.println("오후입니다."); } if (num > 12 && num <= 18) {
		 * System.out.println("이른 오후입니다."); } if (num > 18 && num <= 24) {
		 * System.out.println("늦은 오후입니다."); } if (num < 0 && num > 24)
		 * System.out.println("잘못입력하였습니다."); }
		 */
		System.out.print("숫자 입력 : ");
		int time = scanner.nextInt();

		if (time >= 1 && time <= 24) { // 정상범위 1~24

			if (time <= 12) { // 1 ~ 12 //오전
				System.out.println("오전입니다.");
				if (time <= 6) {// 이른/늦은
					System.out.println("이른 오전입니다.");
				} else {
					System.out.println("늦은 오전입니다.");
				}

			} else { // 13 ~ 24
				System.out.println("오후입니다");
				if (time < 18) {
					System.out.println("이른 오후입니다.");
				} else {
					System.out.println("늦은 오후 입니다.");
				}

			}

		} else { // 잘못된 범위값 입력
			System.out.println("잘못 입력했습니다.");
		}

		int diceNum = 3;

		if (diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else { // case의 default와 같음
			System.out.println("6");
		}
		
		
		String localNum = "031";
		
		switch (localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":
			System.out.println("경기도입니다");
			break;
		case "041":
			System.out.println("경기도입니다");
			break;
		case "051":
			System.out.println("경기도입니다");
			break;
		}
		
	
		/* if( score <= 90) { // 비교군보다 작다는 것으로 논리를 사용 하면 처음에 작은 값 입력 시 범위에 포함되어 출력될 수 있다.
			System.out.println("학점 A");
			} else if ( score <= 80) {
			System.out.println("학점 B");
			} else if (score <= 70) {
			System.out.println("학점 C");
			} else if (score < 70) {
			System.out.println("학점 F");
			} */
		int score = 88;
		if( score >= 90) {
			System.out.println("학점 A");
			} else if ( score >= 80) {
			System.out.println("학점 B");
			} else if (score >= 70) {
			System.out.println("학점 C");
			} else if (score < 70) {
			System.out.println("학점 F");
			}
		
		switch( score/10 ) {
		case 10:
		case 9:
			System.out.println("학점 A");
			break;
		case 8:
			System.out.println("학점 B");
			break;
		case 7 : 
			System.out.println("학점 C");
			break;
		default : 
			System.out.println("학점 A");
			break;
		}
		
		/* case ( score / 10 ) :
		case 99 :
		case 98 :
		case 97 :
		case 96 :
		case 95 :
		case 94 :
		case 93 :
 		case 92 :
		case 91 :
		case 90 :
			System.out.println("학점 A");
			break;
		case 89 :
		case 88 :
		case 87 :
		case 86 :
		case 85 :
		case 84 :
		case 83 :
		case 82 :
		case 81 :
		case 80 :
			System.out.println("학점 B");
			break;
		}*/
		}

	}
	

