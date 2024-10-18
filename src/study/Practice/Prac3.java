package study.Practice;

public class Prac3 {

	public static void main(String[] args) {
		
		
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
		
		String result = 
				(menuPrice <= 6000) ? "훌륭" : 
					(menuPrice <= 8000) ? "선방" : 
						(menuPrice > 12000) ? "물로배채우기" : "눈물" ;
			System.out.println(result);	
	}
}
