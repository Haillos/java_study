package study.Practice.Practice1219;

public class Computer {
	
	//정적 키워드 statice
	//상수 fianl -> static final -> 상수인 경우 모두 대문자로 표기 
					
	public final static String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"}; // 바뀌면 안되는 상수라 final
	
	int osIndex;
	int memory;
	
	public Computer(int osIndex, int memory) {
		this.memory = memory;
		this.osIndex = osIndex;
	}
	
	public void print() {
		System.out.println("운영체제 : " + Computer.OS_TYPE[osIndex]+ "메인메모리 : " + memory);
	}
}

