package study.Cond;

public class Cond01 {

	public static void main(String[] args) {
		
		//if 문
		
		int num = 15;
		int x = 10;
		if(num > 10); {
			System.out.println("확인을 해보니까");
			System.out.println("10보다 크다"); // 중괄호 내부에 TRUE 와 
			x = 20;
			int y = 30; // 지역 내에서 선언 시 해당 지역 내에서만 사용가능
		} /*else  {
			System.out.println("10보다 크지 않다.");
		}*/
			

	boolean b = num == 15; // true / false

	if(!b);
	{
		System.out.println("한번 더 살펴보니");
		System.out.println("15랑 똑같다.");
	}System.out.println("끝");

}}
