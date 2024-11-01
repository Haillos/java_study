package study.Test;

import java.util.Scanner;

public class Level5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] player = { "일번", "이번", "삼번", "사번", "오번", "육번", "칠번", "팔번", "구번" };
		double[] taseok = new double[9];
		double[] anta = new double[9];
		double[] playerBall4 = new double[9];
		double[] playerOut = new double[9];
		int[] base = {0,0,0,0};

		int strike = 0;
		int ball4 = 0;
		int out = 0;
		int j = 0;
		int score = 0;
		for (int i = 1; i <= 3; i++) { // 회차
			System.out.println(i + " 회");
			out = 0; // 아웃카운트 초기화

			while (out <= 2) { // 3아웃시 다음 회차

				if (j < 9 && j >= 0) { // 타자 로테이트

					System.out.print((j + 1) + "번타자 " + player[j]); // 타자 소개
					if(i == 1) {
						System.out.println(" 안타:" + anta[j] + 
								" 볼넷: " + playerBall4[j] + " 아웃: " + playerOut[j]);	
					}
					

					if (taseok[j] == 0) {
						System.out.println(" 타율 : 0");
					} else {
						System.out.printf(" 타율 : %.3f", (anta[j] / taseok[j])); // 타율
						System.out.println();
					}

					strike = 0; // 스트라이크 횟수 초기화
					ball4 = 0; // 볼 횟수 초기화

					while (true) { // n번 타자 야구시작
						int ball = ((int) (Math.random() * 100) + 1); // 볼 난수
						int batter = ((int) (Math.random() * 100) + 1);// 타자 난수

						if (ball <= 10 || (50 <= ball && ball <= 60) || ball >= 90) {
							if ((ball - batter) < 4 && (ball - batter) > -4) {
								System.out.println("안타");
								taseok[j] = taseok[j] + 1; // 타석 수 증가
								anta[j] = anta[j] + 1;
								base[0]=1;
								for(int run = 3; run>0; run--) {
									if (base[run-1] == 1) {
										base[run]=1;
										base[run-1]=0;
									}
								} if(base[3]==1) {
									score++;
									base[3]=0;
								}
								j++; // 다음 선수

								break;

							} else {
								System.out.println("스트라이크");
								strike++;
								taseok[j] = taseok[j] + 1; // 타석 수 증가
								if (strike == 3) {
									System.out.println("아웃");
									out++;
									playerOut[j] = playerOut[j]+1;
									j++;
									break; // 아웃
								}
							}
						} else {
							System.out.println("볼");
							ball4++;
							playerBall4[j] = playerBall4[j]+1;
							taseok[j] = taseok[j] + 1;
						} if (ball4 == 4) {
							System.out.println("안타");
							for(int run = 3; run>0; run--) {
								if (base[run-1] == 1) {
									base[run]=1;
									base[run-1]=0;
								}
							} if(base[3]==1) {
								score++;
								base[3]=0;
							}
							j++;

							break; // 포볼로 출루
						}
						
							
							}
						} else {
							j = 0;
						}
							
					}
				} System.out.println("총점 : " + score);
				}

			}

		
	

