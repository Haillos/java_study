package study.Practice.Prac1224.StarCraft;

public class Tank implements Unit { // 탱크
	int x, y; // 현재 위치

	public void move(int x, int y) {
		System.out.println("x+\","+y+"좌표로 바퀴구르기");
	}

	public void stop() {
		System.out.println("현재 위치 정지");

	}

	void changeMode() {
		System.out.println("공격모드를 변환한다");
	}

}