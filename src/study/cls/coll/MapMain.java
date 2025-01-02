package study.cls.coll;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김하나");
		map1.put(2, "정둘");
		map1.put(3, "이삼");
		
		
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsKey(4));
		
		System.out.println(map1.containsValue("박사"));
		System.out.println(map1.containsValue("김하나"));
		
		System.out.println(map1.get(3));
		
		Map<String> map2 = new HashMap<String>();
	}
}
