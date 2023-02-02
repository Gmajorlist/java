package Basic;

public class Calc {

	public static void main(String[] args) {
		int a,b;
		a = 320;
		b = 258;
		
		int sum, sub, mul;
		sum = a + b;
		sub = a - b;
		mul = a * b;
		float div = (float)a/b;
		//div = a / b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(String.format("%.2f",div));
	}

}
//1줄 주석
/*
[문제] 320(a), 258(b)를 변수에 저장하여 합(sum) , 차(sub), 곱(mul), 몫(div)을 구하시오 
단 소수이하 둘째자리까지 출력

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = xxx
*/
