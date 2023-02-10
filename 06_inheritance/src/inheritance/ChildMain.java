package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	
	ChildMain(){
		System.out.println("SubMain 기본 생성자");
	}
	
	ChildMain(String name, int age, double weight, double height){
		super(weight, height);//부모 생성자 호출
		this.name = name;
		this.age = age;
		super.weight = weight; // 내것도 내거 부모것도 내거 super 하면 부모꺼 this 하면 내꺼  this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("이름 =" + name);
		System.out.println("나이 =" + age);
		super.disp(); // this 생략이 가능하다
	}
// 부모와 자식이 똑같은 소스면 override 라고 합니다
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("호랑이", 23, 88, 199);
		aa.disp();
		System.out.println("==============================");
		
		Super bb = new ChildMain("사자", 22, 77, 200);
		//override = 부모클래스와 자식클래스에 똑같은 메소드가 존재 / 모든 우선권은 자식클래스가 갖는다 / 무조건 자식클래스거
	}

}
/*
overload /쌍둥이
= 하나의 클래스 
= 메서드 이름이 똑같다.
= 인수 개수, 인수형
override
= 부모크래스와 자식클래스 다 똑같아야한다.
=modifier(접근제한자) public,protected, private //  단 , 자식클래스 modifier가 더 커야 한다.

*/

