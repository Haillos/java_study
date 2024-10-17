package study.Practice;

public class Quiz1 {

	public static void main(String[] args) {

		String brand = "로지텍";
		String name = "mx keys";
		int price = 135000;
		String num = "332L1545K"; // 1
		
		String maker = "SAMSUNG";
		int inch = 24;
		String color = "black";
		boolean hasHdmiPort = true; // 작성 시 동사를 붙여주어 더 정확하게
		boolean casPlaySound = false; // 2
		
		double pi = 3.14;
		System.out.println("원주율 : "+pi); // 3
		
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int n1 = Integer.parseInt(mathScore);
		int n2 = Integer.parseInt(englishScore);
		int n3 = Integer.parseInt(artScore);
		
		int result = (n1 + n2 + n3);
		System.out.println(result); // 4
		
		int num1 = 4;
		int num2 = 10;
		double num3 = num1 /(double)num2 ;
		double num4 = (double)num1 /num2 ;
		double num5 = (double)num1 /(double)num2 ;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5); //5
		
				
				
				
				
		
	}
}
