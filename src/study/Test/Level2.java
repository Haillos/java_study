package study.Test;

import java.util.Scanner;

public class Level2 {
	public static void main(String[] args) {

		String[] Arr = new String[9];
		Arr[0] = "1번 김일번";
		Arr[1] = "2번 김이번";
		Arr[2] = "3번 김삼번";
		Arr[3] = "4번 김사번";
		Arr[4] = "5번 김오번";
		Arr[5] = "6번 김육번";
		Arr[6] = "7번 김칠번";
		Arr[7] = "8번 김팔번";
		Arr[8] = "9번 김구번";
		int j = 0;
		int out = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "회");
			out = 0;
			while (true) {
				System.out.println(Arr[j]);
				if(j>=0 && j<=8) {
					j++;
					
				} else {
					j=0;
				}
				
				int ball = ((int) (Math.random() * 10) + 1);

				System.out.print("숫자입력 : ");

				int batter = scanner.nextInt();

				if (ball == batter) {
					System.out.println("안타");
				} else {
					System.out.println("아웃");
					out++;
					if (out == 3) {
						System.out.println("3아웃으로 종료");
						break;
					}
				}
			}
		}

	}
}
