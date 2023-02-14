package com.apple;
import com.zoo.Zoo;

public class Apple {


	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		
		//zoo클래스 tiger () 호출
		//1.동물원 클래스 생성 위에 임포트 해줘
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe(); // 외부에선 가져올수없음 protected
//		z.elephant(); //
//		z.lion(); 
		
	}

}
