package swich_;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		int a, b;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 : ");
		a = sc.nextInt();
		System.out.println("b의 값 : ");
		b = sc.nextInt();
		System.out.println("연산자 입력 : ");
		op = sc.next();
		
		switch(op) {
		case "+" : System.out.println(a+ "+"+b+"="+(a+b)); break;
		case "-" : System.out.println(a+ "-"+b+"="+(a-b)); break;
		case "*" : System.out.println(a+ "*"+b+"="+(a*b)); break;
		case "/" : System.out.println(a+ "/"+b+"="+((double)a/b)); break;
		default : System.out.println("연산자 에러");
		}
		
		
		
	}

}
/*
[문제] 2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error
*/