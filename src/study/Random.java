package study;

public class Random {
	public static void main(String[] args) {

		int ball = ((int) (Math.random() * 100) + 1);
		System.out.println(ball);
	}
	// (int)(Math.random()*숫자개수) + 시작값
	
	//random.nextInt(10,15)
	//10 <= < 15
	
	int ball = ((int) (Math.random() * 100) + 1);
	public Random() {
		// TODO Auto-generated constructor stub
	}
}
