package study.Practice.Prac1224.StarCraft;

public class Marine implements Unit { // 보병
	int x, y; // 현재 위치

	public void move(int x, int y) {
		System.out.println(x+","+y+" 좌표로 걷기"); }

	//지정된 위치로 이동

	public void stop() {
		System.out.println("현재 위치에 정지"); }

	//현재 위치에 정지

	void stimPack() {
		System.out.println("스팀팩을 사용한다");
	}

	
}