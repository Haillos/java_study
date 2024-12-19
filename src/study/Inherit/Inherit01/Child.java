package study.Inherit.Inherit01;

public class Child extends Parent {
	int grade;
	String schoolName;

	public Child() {
		
	}
	public Child(int grade, String schoolName, int money) {
		super(0);    	// 부모클래스의 생성자 호출, 매개변수가 
	  //부모 생성 완료		//필요한 생성자밖에 없다면 매개변수가 들어간 생성자 사용
		this.grade = grade;
		this.schoolName = schoolName;
		
		//자식 생성자 나머지 코드
		System.out.println("child 클래스 생성자");
	}
	public void play() {
		System.out.println("뛰어놀기");
	}
}
