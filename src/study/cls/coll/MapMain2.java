package study.cls.coll;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
	public static void main(String[] args) {
		Map<String, Score> map = new HashMap<String, Score>();
	}
}

class Score { 
	int math;
	int eng;
	int lang;
	
	public Score() {}
	
	public Score(int math, int eng, int lang) {
		super();
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	
}