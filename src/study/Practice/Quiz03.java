package study.Practice;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("출생년도를 입력하세요 : ");
		
		int born =  scanner.nextInt();
		int age = 2024 - born + 1;
		
			if (born < 2024 && born > 1900) {
				
				System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
				int num = scanner.nextInt();
			
				if (num == 1 || num == 3) {
					System.out.println("결과 : " + age + "살" + " 남자입니다." );
				} else if (num == 2 || num == 4) {
					System.out.println("결과 : " + age + "살" + " 여자입니다." );
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		
	/*
		int age = 2024 -year + 1;
		
		if (year < 2000 && number == 1) {
			System.out.println();
		}else if (year < 2000 && number == 2) {
			System.out.println();
		}else if (year >= 2000 && number == 3) {
			System.out.println();
		}else if (year >= 2000 && number == 3) {
			
		}else {
			System.out.println();
		}
	*/
	
		
	}
}
