package study.Inter.Inter02;

public interface Callable {
	
	// 전화 상태
	int CALL_ON = 1;//전화 중인 상태
	public static final int CALL_OFF = 2;
	
	public void call();
}