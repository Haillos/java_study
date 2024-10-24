package study.refer;

public class Arr5 {
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50};
		
		System.out.println(arr); // 원하는 값이 나오지 않음
		
		for(int i=0; i<5; i++) {//index : i: 0 1 2 3 4 
			System.out.print("arr[" + i + "]" + arr[i] + " ");
		}
		
		int index = 0;
		System.out.println();
		
		for(int i : arr ) { // {10, 20, 30, 40, 50};
			// 전체 갯수만큼 처음부터 끝까지 다 반복
			// 값만 주어지고, 인덱스는 모른다.
			System.out.print( i + " ");
			//index++ // 인덱스 확인
		}
		
		int[] scores = {90, 95, 100, 80, 75};
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			//sum = sum + i; 0+1+2+3+4
			sum = sum + scores[i]; // 90+95+100+80+75
		} //1번 방법
		
		sum = 0;
		for(int score : scores) {
			sum =sum + score;
		}System.out.println(sum); //2번 방법
		
		//채점이 잘못되어 모든 점수를 -5점씩 차감하는 상황
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i] -5 ; // -5
			System.out.print(scores[i] + " ");
		} 
		// {85, 90, 95, 75, 70}
		System.out.println();
		
		for(int score:scores) {
			score = score -5;
		} 
		
	}
}
