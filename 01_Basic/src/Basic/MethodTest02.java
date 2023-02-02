package Basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		// 난수 - computer가 불규칙적으로 발생하는 수
		// -0 <= 난수 < 1
		
		double a = Math.random();
		System.out.println("난수 = " + a );
		
		Random r = new Random();
		double b = r.nextDouble();
		System.out.println("난수 = " + b);
		
		int[] ar = new int[5]; // 정수형 변수 /배열
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0] +","+ ar[1]);
		
		 //정렬 = 오름차순
		Arrays.sort(ar);
		System.out.println(ar[2] +","+ ar[1]);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
