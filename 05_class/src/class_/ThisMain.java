package class_;
class This{
	private static int b; //필드
	private static int  c;
	
	
	public void setB(int b ){ //구현, 인수(argument), 매개 변수 (parameter)
		This.b=b;
	}
	public int getB() {
		return b;
	}
	public void setC(int c) {
		This.c=c;
	}
	public int getC() {
		return c;
	}
}
public class ThisMain {
	private int a ; // 필드  같은 클래스로 묶으면 사용가능하다

	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a = 10;
		System.out.println("a = " + tm.a);
		
		This t = new This();
		t.setB(20); //호출 - 호출한 메소드는 반드시 돌아온다.
		System.out.println("b = " + t.getB());
		
		t.setC(30);
		System.out.println("c = " + t.getC());
	}

}
// 모든 클래스는 반드시 생성해야 한다.