package operator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("이름 입력 : "+"\n");
		String name = scan.next();
		System.out.print("직급 입력 : "+"\n");
		String posi = scan.next();
		System.out.print("기본급 입력 :"+"\n");
		int pay = scan.nextInt();
		System.out.print("수당 입력 : "+"\n");
		int extr = scan.nextInt();
		
		int tot = pay + extr;
		int tax = tot >=5000000 ? tax = tot * 0.03 :
	}

}
/*
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/