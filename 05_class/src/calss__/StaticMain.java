package calss__;

class StaticTest{
	private int a; // class 밑에있어서 필드 ,초기화, 인스턴스 변수
	private static int b;// 필드, 클래서 변수 ( 그냥 필드라고 생각)
	
	static {
		System.out.println("초기화 영역");
		StaticTest.b = 5;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 5;
	}
	public void calc() {
		a++;
		b++;
		
	}
	public void disp() {
		System.out.println("a = "+ a+ "b= " +b);
	}
	public static void output() {
		System.out.println("static method...");
//		System.out.println("a = "+ a+ "b= " +staticTest.b);
	//error - static 메소드안에서 static 변수만 사용 가능
	}
	
}


public class StaticMain {

	
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();// 생성자불러 !! 물귀신
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();// 생성자불러 !! 물귀신
		bb.calc();
		bb.disp();
		System.out.println();

		StaticTest cc = new StaticTest();// 생성자불러 !! 물귀신
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output(); //클래스명.메소드()
		aa.output(); //객체.메소드()
		
		
		
	}

}
