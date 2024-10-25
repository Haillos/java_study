package study.Practice;

public class Quiz04 {
	public static void main(String[] args) {

		int[][] Arr = new int [5][5];
		int i = 0;
		int j = 0;
		for (i=0; i<=(Arr.length-1); i++) {
			for (j=0; j<=(Arr.length-1); j++) {
				if(i>j) {
					Arr[i][j] = 3;
				} else if(i<j) {
					Arr[i][j] = 2;
				} else {
					Arr[i][j] = 1;
				}System.out.print(Arr[i][j]);
				
			}System.out.println();
		} 
		
		
	}
}
