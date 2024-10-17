package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt(); // 들어오는 값이 타입이 맞지 않으면 오류발생

		System.out.println(num);
		System.out.println(num == 10); // == > 같은지 비교하는 연산자
		// true or false

		scanner.nextLine(); // 엔터까지 입력을 받아라 남은 \n 청소용

		String str = scanner.nextLine();

		System.out.println(str);
		System.out.println(str == "밥"); // 밥을 넣었으나 false
		System.out.println(str.equals("밥"));
		System.out.println("밥".equals(str));// str과 밥의 위치 바꾼 버전
		// 문자열을 비교할 때는 equals 사용해야 한다. (비교.equals("입력"))
		
		
	}

}
