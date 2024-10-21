package study.Practice;

public class Prac6 {
	
	public static void main(String[] args) {

		
		
		for (int i=0; i<=10; i++) {
			System.out.print(i + " ");
		} // 1
		System.out.println();
		
		for (int i=1; i<10; i++) {
			System.out.print(i + " ");
		} // 1
		System.out.println();
		
		for (int i=0; i<=100; i=i+10) {
			System.out.print(i + " ");
		} // 1
		System.out.println();
		
		for (int i=25; i<=100; i=i+25) {
			System.out.print(i + " ");
		} // 1
	
		System.out.println("====================================================");
		
		int j = 50;
		/* while (j <= 55) {
			System.out.print(j + " ");
			j++;
			if (j > 55)
				break; 
		} */
		
		while(true) {
			System.out.print(j + " ");
			j++ ;
			
			if (j>55)
				break;
		} 
		System.out.println();
		
		int j2 = 10;
		while (j2>=1) {
			System.out.print(j2 + " ");
			j2--;
		}
		System.out.println();
		
		int j3= 30;
		while (j3>=0) {
			System.out.print(j3 + " ");
			j3 = j3-5;
		}
		System.out.println();
		
		int j4= 30;
		while (j4>=5) {
			System.out.print(j4 + " ");
			j4 = j4-5;
		}
		System.out.println();
		
		int j5= 25;
		while (j5>=0) {
			System.out.print(j5 + " ");
			j5 = j5-5;
		}
		
		
		
		
		
	}
}
