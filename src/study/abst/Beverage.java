package study.abst;

public abstract class Beverage { //음료
	String name; //이름
	int ml; // 용량
	
	 public void intro() {
		 System.out.println("저는 음료입니다.");
	 }
	
	 public abstract void checkSafety();// 안전검사
	 //추상 메소드
}
