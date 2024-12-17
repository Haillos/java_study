package study.Practice;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// 1.

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6) {
					System.out.print(i);
					System.out.print(j);
					System.out.println();
				}
			}
		}
		System.out.println("=================================");

		// 2

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("=================================");

		// 3
		Scanner scanner = new Scanner(System.in);

		int[] classRoom1 = new int[5];
		int[] classRoom2 = new int[5];
		int[] classRoom3 = new int[5];

		// 점수 입력
		System.out.println("1반");
		for (int i = 0; i < classRoom1.length; i++) {
			System.out.print((i + 1) + "번째 점수를 입력하세요 : ");
			classRoom1[i] = scanner.nextInt();
		}
		System.out.println("================");
		System.out.println("2반");
		for (int j = 0; j < classRoom2.length; j++) {
			System.out.print((j + 1) + "번째 점수를 입력하세요 : ");
			classRoom2[j] = scanner.nextInt();
		}
		System.out.println("================");
		System.out.println("3반");
		for (int k = 0; k < classRoom3.length; k++) {
			System.out.print((k + 1) + "번째 점수를 입력하세요 : ");
			classRoom3[k] = scanner.nextInt();
		}

		// 반 별 합계
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int x : classRoom1) {
			sum1 += x;
		}
		for (int y : classRoom2) {
			sum2 += y;
		}
		for (int z : classRoom3) {
			sum3 += z;
		}

		System.out.println("1반 합계 : " + sum1);
		System.out.println("2반 합계 : " + sum2);
		System.out.println("3반 합계 : " + sum3);

		// 반 별 평균
		int average1 = sum1 / classRoom1.length;
		int average2 = sum2 / classRoom2.length;
		int average3 = sum3 / classRoom3.length;
		// 종합 평균
		int totlaAverage = (average1 + average2 + average3) / 3;

		System.out.println("1반 평균 : " + average1);
		System.out.println("2반 평균 : " + average2);
		System.out.println("3반 평균 : " + average3);
		System.out.println("전체 평균 : " + totlaAverage);

		// 4.
		int row = 0;
		int column = 0;
		int arrsum1 = 0;
		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
		
		    
			for(int j=0; j<arr[0].length; j++) {
				arr[j] = new int[arr[j].length];
				arr[0][arr[j].length] += arr[0][j];
			} System.out.println(arr[0]);
	}

}
