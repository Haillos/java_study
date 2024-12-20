package study.Practice.Prac1220.Sports;

public class ProtectedFields {
	public static void main(String[] args) {
// 객체 생성
		Basketball b = new Basketball();
		Soccer s = new Soccer();
		PingPong p = new PingPong();

// 객체 필드 초기화
		b.name = "농구";
		s.name = "축구";
		p.name = "탁구";

		Sports ss = new Sports();
		ss.name = "스포츠";
		
// 부모 타입(업 캐스팅)으로 배열 생성
		Sports[] sportsArr = {ss, b, s, p };

// 모든 운동 설명 출력
		for (int i = 0; i < sportsArr.length; i++) {
			Sports tmp = sportsArr[i];
			tmp.description();
		}
	}
}
