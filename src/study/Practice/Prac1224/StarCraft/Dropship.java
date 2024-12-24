package study.Practice.Prac1224.StarCraft;

public class Dropship implements Unit { // 수송선
	int x, y; // 현재 위치

	@Override
	public void move(int x, int y) {
		System.out.println("날기");
	}

	@Override
	public void stop() {
		System.out.println("현재 위치 정지");
	}

	void load() {
		System.out.println("선택된 대상을 태운다");
	}

	void unload() {
		System.out.println("택된 대상을 내린다");
	}

}
