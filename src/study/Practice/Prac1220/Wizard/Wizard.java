package study.Practice.Prac1220.Wizard;

public class Wizard extends Novice {
	int mp;
	
	public void punch(){
		System.out.printf("[%s]의 펀치!!\n", name);
	}
	
	public void fireball() {
		System.out.printf("[%s]의 파이어볼@@\n", name);
	}
	
}
