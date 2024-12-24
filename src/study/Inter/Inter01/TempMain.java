package study.Inter.Inter01;

public class TempMain {

	public static void main(String[] args) {
		
//		Temp t = new Temp();// 인터페이스는 생성 불가.
		TempObject t1 = new TempObject();
		
		Temp t = new TempObject();
		Temp2 t2 = new TempObject();
		
		Temp[] tArr = new Temp[3];
		//tArr[0] = new Temp();
		tArr[0] = new TempObject();
	}
}
