package study.var;

public class Variable04 {

	public static void main(String[] args) {

		String s1 = "1231";

		int n1 = 50;
		int n2 = Integer.parseInt(s1); // "1231 → 1231 String을 int로 변환
		
		System.out.println(s1 + n1);
		
		System.out.println(n1 + n2);
		System.out.println(n1 + Integer.parseInt(s1)); // 위의 계산식과 같다.
		
		String s2 = "13.13";
				//int n3 = Integer.parseInt(s2);
		double d1 = Double.parseDouble(s2); // String을 double로 변환
		System.out.println(d1);
		
		boolean b1 = true;
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3); //String을 boolean으로 변환
		System.out.println(b2);
		
		String s4 = String.valueOf(b2);
		String s5 = String.valueOf(n1);
		
		String s7 = 123 + "";
		// int + String = String "123"
		System.out.println(s7);
	}

}
