package study.Practice;

import java.util.Scanner;

public class Prac12 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		} // 1

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // 2
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = scanner.nextInt();
		for (int x = 1; x <= num; x++) {
			if (num % x==0) {	
				System.out.print(x + " "); // 3
			}
		} System.out.println();
		
		
		
		
		System.out.print("입력 : ");
		int num2 = scanner.nextInt();
		
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < num2; i++) {
			for (int j = num2; j > i; j--) {
				System.out.print("*");
			}
			System.out.println(""); //4
		}
		
		
		int sum = 0;
		
		for (int l = 1; l <= 10; l++) {
		    	for (int t = 0; t<=l; t++) {
		    		sum = sum + t;
		    	}
		 } System.out.println("5번 : " + sum); //5
			
		
		 
		 int sum3 = 0;
		 int m = 0;
		 
		 for(m=1; sum3<100; m++ ) {
			 if (m % 2 == 0) {
					sum3 -= m;
				} else {
					sum3 += m;
				}  
		 } System.out.println(m); // 충합이 100이 넘는 시점의 
		 
		 int n = 1;
		 int sum4 = 0;
			for (n = 1; sum4 < 100; n++) {
				if (n % 2 == 0) {
					sum4 = sum4-n;
				} else {
					sum4 = sum4+n;
				}
			} System.out.print("누적합 : " + sum4 + " 얼마까지 계산했는가 : " + (n-1)); //6 100이상 됐을 때 누적 합
			
			System.out.println();
			
			sum = 0;
			int currentSum = 0;
			for(int i=1; i<=10; i++) {//i i=1~10
				currentSum = currentSum + i; // 1 , 1+2, 1+2+3 ...
				sum = sum + currentSum;
			}
			System.out.println("총합 : " + sum);
			
		
		
		
	
	}
		 
	
}
