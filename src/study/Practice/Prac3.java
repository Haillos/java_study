package study.Practice;

public class Prac3 {

	public static void main(String[] args) {
		
		/* x=2 y=3
		 * 5
		 * 5
		 * x= 4 y= 5
		 * z = 9  
		 * x = 6  y = 7
		 * 7
		 * 11
		 * x = 6 y = 5 z = 7
		 * z = 2
		 * x = 6 y = 7 z = 2
		 * x = 12 y = 9 = z = 2
		 * x = 6 y = 9 = z = 2
		 */
		
		
		/*
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) );
		System.out.println( (a == b ) || ( a >= b) || (c > 10) );
		boolean result = !(c == 3);
		System.out.println( result );
		
		  true
		  false
		  false
		  
		 */
		
		int menuPrice = 12000;
		
		String result = (menuPrice <= 6000) ? "훌륭" : (menuPrice <= 8000) ? "선방" : (menuPrice > 12000) ? "물로배채우기" : "눈물" ;
			System.out.println(result);	
	}
}
