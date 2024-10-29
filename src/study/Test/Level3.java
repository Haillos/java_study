package study.Test;

import java.util.Scanner;

public class Level3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] player = {"일번","이번","삼번","사번","오번","육번","칠번","팔번","구번"};
		int[] taseok = new int[9];
		int[] anta = new int[9];
				
		
		
		
		int out = 0;
		int j = 0;
		for (int i = 1; i <= 6; i++) {
			System.out.println(i +" 회");
			out = 0;
			while (true) {
				
				if(j<9 && j>=0) {
					
					System.out.print((j+1)+"번타자 " +player[j]+" "); // 타자 소개
						
					if(taseok[j]==0) {
						System.out.println("타율 : 0");	
					}else {
						System.out.println("타율 : " + (double)(anta[j]/taseok[j]));	// 타율
					}
										
					taseok[j] = taseok[j]+1; // 타석 수 증가
					j++; // 선수 로테이트
					
				} else {
					j = 0;// 선수 로테이트
				}
					
				int ball = ((int) (Math.random() * 10) + 1);
				System.out.print("숫자 입력 : ");
				int batter = scanner.nextInt();

				if (ball == batter) {
					System.out.println("안타");
					anta[j]=anta[j]+1;
				} else {
					System.out.println("아웃");
					out++;
					if (out == 3) {
						System.out.println("3아웃으로 종료");
						break;
					}

				}

			}
		} System.out.println("경기 끝");
	}
}
