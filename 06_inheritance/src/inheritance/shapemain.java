package inheritance;

import java.util.Scanner;

class Shape{
	protected double area;
	protected Scanner sc = new Scanner(System.in);
	
	public Shape() {
		System.out.println("ShapeTest 기본생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
}
class Sam extends Shape{
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam 기본 생성자");
		System.out.println("밑변 : ");
		base = sc.nextInt();	
		System.out.println("높이 :");
		height = sc.nextInt();

	}
	@Override //각 메소드 마다 써주는게 좋음
	public void calcArea() {
		area = base * height / 2.0;
	}
	@Override  
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area );
	}
}
//=======================================================
class Sa extends Shape{
	protected int width, height;
	public Sa() {
		System.out.println("Sa 기본 생성자");
		System.out.println("넓이 : ");
		width = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
	}
	
}

public class shapemain {

	public static void main(String[] args) {
		Sam sam = new Sam();
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		System.out.println();
	//다형성 >>> 부모 = 자식
		Shape shape;
		shape = new Sam();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
	}

}
