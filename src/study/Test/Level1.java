package study.Test;

import java.util.Scanner;

public class Level1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int out = 0;
		
		for (int i=1; i<=3; i++ ) {
			System.out.println(i+"회");
			out = 0;
		while (true) {
			
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
