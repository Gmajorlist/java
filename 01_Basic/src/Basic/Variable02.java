package Basic;

class Test{
	int a = 10;
	static int b=20;
	static String str;
}
//--------------- public은 주인이라 주인은 하나만 
public class Variable02 {
	int a; // 필드, 초기화 
	double b; //필드
	static int c;
	
	public static void main(String[] args) {
		int a = 5; //지역변수(local variable), garbage 값을 가짐
		System.out.println("지역변수 a = " + a);
		
		Variable02 v = new Variable02();//메모리 생성
		System.out.println("객체 = " + v);
		System.out.println("필드 a = " + v.a);
		System.out.println("필드 b = " + v.b);
		
		System.out.println("필드 b = " + c);
		System.out.println("필드 b = " +Variable02.c);
		System.out.println();
		
//		test클래스의 a 값을 출력하시오.
		Test t = new Test();
		System.out.println("필드 a = " + t.a);
		System.out.println("필드 b = " + t.b);
		System.out.println("필드 c = " + t.str);
		
		
		
		
	}

}
