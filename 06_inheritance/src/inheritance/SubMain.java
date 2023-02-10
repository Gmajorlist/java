package inheritance;

public class SubMain extends Super {
	private String name;
	private int age;
	
	
	SubMain(){
		System.out.println("SubMain 기본 생성자");
	}
	
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		super.weight = weight; // 내것도 내거 부모것도 내거 super 하면 부모꺼 this 하면 내꺼 
		this.height = height;
	}
	
	public void output() {
		System.out.println("이름 =" + name);
		System.out.println("나이 =" + age);
		this.disp(); // this 생략이 가능하다
	}

	public static void main(String[] args) {
		SubMain aa = new SubMain("호랑이", 23, 88, 199);
		aa.disp(); //부모 메소드 호출
		System.out.println("-----------------------------------------------------------------------------");
		aa.output();
		System.out.println("--------------------------------------------------------");
		
		Super bb = new SubMain("코난",13, 44,166);
		//bb는 output를 부를수없다
		bb.disp();
	}

}
/*
자식 클래스 메모리 생성할 때 
- 부모 클래스 생성
- 자식 클래서 생성
*/