package study.Practice;

import java.util.Scanner;

public class Prac13 {
	
	public static void main(String[] args) {
/*
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");

		Scanner scanner = new Scanner(System.in);

		System.out.print("메뉴 번호를 입력하세요 : ");
	     int menuNum = scanner.nextInt();

		
			if (menuNum == 5) {
				System.out.println("프로그램이 종료됩니다");
			} else if (menuNum == 1) {
				System.out.println("입력메뉴입니다.");
			} else if (menuNum == 2) {
				System.out.println("수정메뉴입니다.");
			} else if (menuNum == 3) {
				System.out.println("조회메뉴입니다.");
			} else if (menuNum == 4) {
				System.out.println("삭제메뉴입니다");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("메뉴 번호를 입력하세요 : ");
	     int menu = scanner.nextInt();
	    while (true) { 
	     if (menu>=1 && menu <= 5) {
	    	 if (menu == 1) {
					System.out.println("입력메뉴입니다.");
				} else if (menu == 2) {
					System.out.println("수정메뉴입니다.");
				} else if (menu == 3) {
					System.out.println("조회메뉴입니다.");
				} else if (menu == 4) {
					System.out.println("삭제메뉴입니다");
				} else if (menu == 5) {
					System.out.println("프로그램이 종료됩니다");
					break;
				} else {
			    	 System.out.println("잘못 입력하셨습니다.");
	  
				}
	     }
	}*/
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		String[] menuArr = {"입력" , "수정", "조회", "삭제", "종료"};
		
	     
		while(true) {
			
			for(int i = 0; i<menuArr.length; i++) {
				System.out.printf("%d. %s\n", (i+1), menuArr[i]);
			}
			System.out.print("메뉴 번호를 입력하세요 : ");
			 menu = scanner.nextInt();
			 
			 if(menu >=1 && menu <=4) {
				 System.out.println(menuArr[menu-1] + " 메뉴입니다.");
			 }else if (menu == 5) {
				 System.out.println("잘못입력하셨습니다,");
			 }
			 System.out.println();
			 }
		}
}
