package study.Inter.Inter02;

public class LGPhone implements Callable {
	int callStatus; // 전화 상태 변수
	
	@Override
	public void call() {
		System.out.println("엘지 전화 검");
		callStatus = Callable.CALL_ON;
	}
}
