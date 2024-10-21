package study.Iter;

public class Iteration02 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * for(초기; 조건; 증감){
		 * 	실행문;
		 * }
		 * 
		 * while (조건) {
		 * 	실행문;
		 * }
		 */
		
		// 5번만 출력
		
		System.out.println("피곤하다");
		
		for (int i=1; i<=5; i++) {
			// i : 1 2 3 4 5 
			System.out.println("피곤하다");
		}
		
		int j = 1;//초기
		while(j<=5) {// 조건
			System.out.println("졸리다.");
			j++; // 증감
		}
		
		/* while(true) { // 무한반복
			System.out.println("무한");
		} */
		
		int k = 10;
		do {
			System.out.println("k do while");	
		} while(k<5);
		
		k = 1;
		while(true) {
			//무한루프
			k++; // 출력과 순번의 위치에 따라 출력 값이 달라진다. 출력 앞 : 2~10 출력 뒤 : 1~9
			System.out.println(k);
			
		
			if(k==10) {// break에 조건을 추가
				break; // 멈추기
			}
		}
		
		// 
		System.out.println("=========================================");
		for(int i=1; i<=10; i++) {
			
			if(i == 5)
				continue; // break 와 다르게 if 조건이 충족할 때 한 번 건너뛴 후 다시 for문으로 돌아간다.
			System.out.println(i);
		}
	}
}
