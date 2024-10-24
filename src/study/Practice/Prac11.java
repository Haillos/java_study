package study.Practice;

import java.util.Scanner;

public class Prac11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y < 10; y++) {
				if ((2 * x) + (4 * y) == 10) {
					System.out.println("x = " + x + " y = " + y);
				}
			}
		} // 1
		
		
		System.out.print("정수 2개를 입력하세요 : ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		if (first >= second) {
			System.out.println("결과 : " + (first - second));
		}else {
			System.out.println("결과 : " + (second - first));
		} // 2
		
		
		System.out.print("윷 4개를 입력하세요 : ");
		
			int[] nArr = new int[4];
			
		//int count = 0;
		//for(int=0; i<yArr.length; i++) {
			
		
		
		int sum = 0;
		
		for(int j=0; j<=3; j++) {
			sum = sum + nArr[j];
		}
		
		switch (sum) {
		
		case  0 :
			System.out.println("모");
			break;
		case  1 :
			System.out.println("도");
			break;
		case  2 :
			System.out.println("개");
			break;
		case  3 :
			System.out.println("걸");
			break;
		case  4 :
			System.out.println("윷");
			break;
		}
		
			

		System.out.print("정수 입력 : ");
		int num4 = scanner.nextInt();
		for (int i = 0; i < num4; i++) {
			System.out.print("*"); // 4
		}
	}
}
