package study.refer;

import java.util.Scanner;

public class Refer01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
/*
		int num = 0;
		int n;

		String s1;
		String s2 = null;

		// System.out.println(n);
		System.out.println(num);
		// System.out.println(s1);
		System.out.println(s2);
*/
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		String str4 = new String("아침");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));

		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
		String test = null;
		System.out.println(test.equals("널이냐"));
	
		
	}
}