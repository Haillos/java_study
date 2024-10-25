package study.Practice;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		int count;
		String addOrder = null;
		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼" };
		int[] priceArr = { 3500, 4100, 4300 };
		// index 0 1 2
		// 사용자 선택 1 2 3 
		int[] countArr = new int[3]; // 메뉴주문수량

		while (true) {

			while (true) {
				System.out.println("========== 메뉴 =========");
				for (int i = 0; i < menuArr.length; i++) {
					System.out.printf("%d.%s %d원\n", i + 1, menuArr[i], priceArr[i]);
				}
				System.out.println("========================");

				System.out.print("메뉴 선택 : ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= menuArr.length) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
				System.out.print("주문더?");
				addOrder = scanner.next();
			if(addOrder.equals("n")) {
				
				int total = 0;
				for(int i=0; i<menuArr.length; i++) {
					
					if(countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i]*3500 );
					}
				}
			}
				
			}
			}
			

			/*
			 * int menu; int count; int menu1Count=0; int menu2Count=0; int menu3Count=0;
			 * String addOrder;
			 * 
			 * while(true) {
			 * 
			 * System.out.println("========== 메뉴 =========");
			 * System.out.println("1. 아메리카노	3500원"); System.out.println("2. 카페라떼	4100원");
			 * System.out.println("3. 바닐라라떼	4300원");
			 * System.out.println("========================"); /*
			 * System.out.println("========== 메뉴 =========");
			 * System.out.printf("%-10s%8s\n", "1. 아메리카노","3500원");
			 * System.out.printf("%-10s%8s\n", "2. 카페라떼", "4100원");
			 * System.out.printf("%-10s%8s\n", "3. 바닐라라떼","4300원");
			 * System.out.println("========================");
			 * 
			 * Scanner scanner = new Scanner(System.in);
			 * 
			 * System.out.print("메뉴 선택 : "); menu = scanner.nextInt(); if(menu == 1 || menu
			 * == 2 || menu == 3 ) {//정상선택
			 * 
			 * System.out.print("수량 선택 : "); count = scanner.nextInt();// 2
			 * 
			 * if(menu == 1) menu1Count += count; if(menu == 2) menu2Count += count; if(menu
			 * == 3) menu3Count += count;
			 * 
			 * scanner.nextLine(); // 입력값 청소
			 * 
			 * while(true) { System.out.println("추가 주문 하시겠습니까 ?"); addOrder =
			 * scanner.nextLine();//문자열 //잘못된 입력, 정상 입력 //y
			 * 
			 * if (addOrder.equals("n")) { //입력받는 반복문 끝 //주문한 메뉴 보여주고 if(menu1Count >0)
			 * System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500 ); //
			 * 아메리카노 if(menu2Count >0) System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count,
			 * menu2Count*4100 ); // 카페라떼 if(menu3Count >0)
			 * System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300 ); //
			 * 바닐라라떼 int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
			 * System.out.println("총액 : " + total + "원"); //총 금액 보여주기 > 끝 break; } else
			 * if(addOrder.equals("y"){
			 * 
			 * } else { System.out.println("잘못 입력하셨습니다. 다시 입력하세요"); }
			 */

		}
	}

