package study.Practice;

public class Quiz6 {
	public static void main(String[] args) {

		int[][] arr1 = new int[4][4];
		int result = 1;

		for (int i = 0; i <= (arr1.length - 1); i++) {
			System.out.println();

			for (int j = 0; j <= (arr1[i].length - 1); j++) {
				arr1[i][j] = result;
				result = result + 1;
				System.out.print(arr1[i][j] + " ");
			} // (i+1)+(j*4)
		}

		System.out.println();
		System.out.println("=====================================");

		result = 1;
		for (int i = 0; i <arr1.length; i++) {
			System.out.println();

			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = result;
				result = result;
				result++;
						
				System.out.print(arr1[j][i] + " ");
			} // (i*4)+(j+1)
		}

		System.out.println();
		System.out.println("=====================================");

		
		
		result = 16;
		for (int i = 0; i <= (arr1.length - 1); i++) {
			System.out.println();

			for (int j = 0; j <= (arr1[i].length - 1); j++) {
				arr1[i][j] = result;
				result--;
				System.out.print(arr1[i][j] + " ");
			} // 16 - (i*4) -j
		}

		System.out.println();
		System.out.println("=====================================");
		
		result = 16;
		for (int i = 0; i <= (arr1.length - 1); i++) {
			System.out.println();

			for (int j = 0; j <= (arr1[i].length - 1); j++) {
				arr1[i][j] = result;
				result = result - 1;
				System.out.print(arr1[j][i] + " ");
			}
		}
	}
}
