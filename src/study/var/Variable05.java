package study.var;

import java.util.Scanner;

public class Variable05 {
	public static void main(String[] args) {
		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println("s"); // 줄 바꿈 O
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print("s"); // 줄 바꿈 X
		
		
		int hour = 10;
		int minute = 26;
		
		
		//현재 10시 26분 입니다.
		System.out.println("현재" + hour + "시" + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute);
		
		double rate = 1.15512;
		
		System.out.printf("%10.2f %%\n" ,rate);
		//\\        \n → 줄 바꾸기 %% → % 붙이기

		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("입력하세요 : ");
		String input = scanner.nextLine(); // "아무거나입력"
		System.out.println(input);
		
		// "12333" -> int
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n" , input);
		
		System.out.print("정수를 입력하세요 : ");
		int point = scanner.nextInt();
		System.out.println(point);
		// scanner.nextDouble();
		// String > int
		// input 값을 String 으로 해야 입력값으로 인해 에러가 발생하지 않는다.
		
		
		
	}

}
