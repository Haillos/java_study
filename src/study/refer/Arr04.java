package study.refer;

public class Arr04 {

	public static void main(String[] args) {
		/*
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		
		b=20;
		System.out.println(a + " " + b);
		*/
		
		/* for 문으로 개별 복사
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[3];
		
		for (int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();

		for (int i=0; i<3; i++) {
			arr2[i] = arr1[i]; // 배열 복사
		}
		
		for (int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		arr2[0] = 999;
		
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();

		for (int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");	
		}*/
		
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[3];
		
		//복사대상 위치 저장대상 위치 갯수
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for (int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();

		for (int i=0; i<3; i++) {
			arr2[i] = arr1[i]; // 배열 복사
		}
		
		for (int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
	
	}
}
