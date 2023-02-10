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

public class shapemain {

	public static void main(String[] args) {
		Sam sam = new Sam();
		sam.calcArea();
		sam.dispArea();
			
		
	}

}
