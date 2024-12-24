package study.Inter.Inter01;

public interface Temp {

	static final int code = 30;
	/* static final */ int TYPE = 50;

	public abstract void method1(); // 추상메소드

	public /* abstract */ void method2(); // 추상메소드 메소드 선언부분만 작성

}
