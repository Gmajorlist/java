package abstract_;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest();//추상클래스는 new 메모리에 생성x
		at.setName("홍길동");
		System.out.println(at.getName());
	}

}
