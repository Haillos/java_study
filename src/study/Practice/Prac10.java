package study.Practice;

import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = scanner.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		} // 1

		System.out.print("정수 입력 : ");
		int num2 = scanner.nextInt();
		if (num2 % 7 == 0) {
			System.out.println("7의 배수 입니다.");
		} else {
			System.out.println("아닙니다.");
		} // 2

		int sum3 = 0;
		for (int num3 = 0; num3 <= 1000; num3++) {
			if (num3 % 5 == 0) {
				sum3 += num3;
			}
		}
		System.out.println(sum3); // 3

		System.out.print("정수 입력 : ");
		int num4 = scanner.nextInt();
		for (int i = 0; i < num4; i++) {
			System.out.print("*"); // 4
		}
		
		System.out.println();

		int sum4 = 0;
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				sum4 -= j;
			} else {
				sum4 += j;
			}
		}
		System.out.print("결과 : " + sum4); //5
		System.out.println();
		
		
		int sum6 = 0;
		int num6 = 0;
		while (true) {
			num6++;
			sum6+=num6;
			if (sum6 > 1000) {
				break;
		} 

		} System.out.println("결과 : " + sum6); //6
		
		System.out.print("정수 입력 : ");
		int num7 = scanner.nextInt();
		for (int i7 = 1; i7<=9; i7++) {
			System.out.println(num7 + " * " + i7 + " = " + (num7*i7)  ); //7
		}
		
		
		
		
	}
}
