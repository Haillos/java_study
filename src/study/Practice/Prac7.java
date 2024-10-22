package study.Practice;
import java.util.Scanner;
public class Prac7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		/*
		int[] arr1 = {0, 10, 20, 30, 50, 90};
		System.out.println("몇 번째 수인가요 ? ");
		int num = scanner.nextInt();
		if (num <= 5  && num >= 0) {
			System.out.println("결과 : " + arr1[num]);
		} //1
		*/
		int[] numArr = new int[5];
		System.out.print("5개 정수를 입력하세요 : ");
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수 : ");
		int index = scanner.nextInt();
		
		System.out.println(numArr[index-1]); // 1
		

		int[] numArr2 = new int[5];
		System.out.print("5개 정수를 입력하세요 : ");
		for (int i=0; i<numArr2.length; i++) {
			numArr2[i] = scanner.nextInt();
		}
		
		System.out.print("결과 : ");
		for(int i=4; i>=0; i--) {
			System.out.print(numArr2[i] + " ");
		} // 2
		
		int num1=0;
		int[][] nArr = new int[4][4];
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				nArr[i][j] = num1;
				num1 = num1+1;
			
		
		/*int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for (int i=0; i<arr3.length; i++ ) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
			}System.out.println();
		} //3*/
		
		
		
	}
}
