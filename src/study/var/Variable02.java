package study.var;

public class Variable02 {
	
	public static void main(String[] args) {
	int num2 = 0b10;  //2
	int num8 = 123;   //10
	int num10 = 10;   //10
	int num16 = 0x30; //48
	
	
	char var1 = 'A';
	char var2 = 86;
	char var3 = 0x0123;
	
	char var4 = 'D'; // 'AD' X 
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	
	String menu = "점심메뉴";
	String subMenu = "12313"; // 12313 숫자이지만 큰 따옴표로 감싸 저장 가능.
			
	System.out.println(menu);
	System.out.println(subMenu);
	
	System.out.println(var2 + 10);
	// 86+10 = 96
	System.out.println(menu + subMenu);
	//  점심메뉴 + 12313 이어붙이는 형식
    System.out.println(menu + var2);
    System.out.println(subMenu + 500);
    
    String msg = " \"안녕\" 하세요 ";
    System.out.println(msg);
    
    double d1 = 12.12;
    double d2 = 0.1212e2;
    float f1 = 12.12f; 
    
    boolean stop = false;
    boolean open = true;
    boolean close = false;
    
    int intValue = 65;
    char charValue = (char) intValue;
    System.out.println(charValue);
    
}
}
