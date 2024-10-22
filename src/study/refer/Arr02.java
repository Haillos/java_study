package study.refer;

public class Arr02 {

	public static void main(String[] args) {

		
	//int[]
	//int[][]
	//int[][][][]
		
		int[][] nArr = new int[3][5];
		
		/* 0 1 2  3 4
	     0 ㅁ ㅁ ㅁ ㅁ ㅁ 
		 1 ㅁ ㅁ ㅁ ㅁ ㅁ 
		 2 ㅁ ㅁ ㅁ ㅁ ㅁ 
		 */
		// nArr.length > 행의 길이
		// nArr[0]length > 열의 길이
		int[][] nArr2 = new int [2][3];
		
		/* 0 1 2
		 0 ㅁ ㅁ ㅁ
		 1 ㅁ ㅁ ㅁ
		        */
		
		int[][] nArr3 = { {1,2,3}, {4,5,6} };
				// 2  3
		//		0 1  0 1 2
		
		/*
		 	0 1 2
		 0	1 2 3
		 1  4 5 6 
		 */
		
		for(int i=0; i<nArr3.length; i++) {
			// i : 0 1
			for(int j=0; j<nArr[i].length; j++) {
				
				System.out.print(nArr[i][j] + " ");
			} System.out.println();
		}
		
		int[][] nArr4 = new int[5][3];
	}
}
