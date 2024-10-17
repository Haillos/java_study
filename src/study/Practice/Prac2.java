package study.Practice;

public class Prac2 {

	public static void main(String[] args) {
		
		int x = 10; int y = 4;
		int result = 10/4;
		double result1 = 10/(double)4;
		System.out.println(result);
		System.out.println(result1); // 1
		
		double a2 = 3.5;
		double b2 = 4.7;
		double result2 = a2 + (int)b2;
		System.out.println(result2); // 2
		
		String a3 = "3.4";
		String b3 = "4";
		int result3 = (int)Double.parseDouble(a3) * (int)Integer.parseInt(b3);
		System.out.println(result3); // 3 
		
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 + (Integer.parseInt(a4) + b4);
		System.out.println(result4); // 4
		
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		
		String result5 =
		a5 * (int)Double.parseDouble(c5) + String.valueOf((int)b5);
		
		System.out.println(result5); // 5
		
		int x6 = 111;
		int y6 = 13;
		
		int result6 = x6 / y6;
		int result7 = x6 % y6;
		System.out.println(result6);
		System.out.println(result7);
		

		
		
		

	}
}
