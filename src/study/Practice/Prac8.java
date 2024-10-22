package study.Practice;

import java.util.Scanner;

public class Prac8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
			System.out.print("국어점수 : ");
			int kor = scanner.nextInt();
			System.out.print("수학점수 : ");
			int math = scanner.nextInt();
			System.out.print("영어점수 : ");
			int eng = scanner.nextInt();
			int sum = kor + math + eng;
			double result = (double)sum/3; 
			if (kor >= 40 && math >= 40 && eng >= 40 && sum / 3 >= 60) {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + result);
				System.out.println("축하합니다.합격입니다!");
			} else {
			
				System.out.println("불합격입니다");
			}
	
	}
}