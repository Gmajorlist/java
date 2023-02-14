package inheritance;

enum Color{ //enum 상수들의 집합체 (생략public static final)
	RED , GREEN, BLUE //색을 간단한게 정의함
}


//-------------------------------
class Final{// 나는 메뉴판 아래에 new 생성해줘
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "기린";
	//static 시음식 - 실행하자마자 메모리 자동으로 생성 (new 할 필요 없어)
	// static은 생성자에서 초기화가 안된다.
	public static final String ANIMAL2;

	public static final int RED =0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;
	//색은 0부터 255까지 끝
	// 0 0 0 - 검정색 255 255 255 - 흰색
	//구글에 색상표 검색
	static {
		System.out.println("static 초기화 영역");
		 ANIMAL2 = "코끼리";
	}
	
	public Final() {
		System.out.println("기본 생성자");
		FRUIT2 = "딸기";
	}
}
//--------------------------
public class FinalMain {

	public static void main(String[] args) {
		final int A = 10; //상수화 시킬거임 - final
		//A = 20;    //error - final은 값을 변경할 수 없다.
		System.out.println("A = " + A);
		
		final int B;
		B = 30;
		System.out.println("B = " + B);
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT );
		System.out.println("FRUIT2 = " + f.FRUIT2);
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);//컴퓨터는 RED=0으로 인식
		System.out.println("빨강 = " + Color.RED.ordinal());// ordinal쓰면 0이나옴
		
		for(Color data : Color.values()) {
			System.out.println(data + "\t" + data.ordinal());
		}
		
	}

}
