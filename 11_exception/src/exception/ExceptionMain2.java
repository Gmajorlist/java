package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x,y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x 입력 : " );
		x = sc.nextInt();
		System.out.println("y 입력 : " );
		y = sc.nextInt();
	
	}
	public void output() {
		if(y >= 0) {
			int mul =1 ;
			for(int i=1; i<=y; i++) {
				mul*=x;
		}
			System.out.println(x + "의" + y + "승은" + mul);
		}else {
			//System.out.println("y는 0보다 크거나 같아야 해 ");
			// 개발자가 강제로 Exception 발생
			try {
			throw new Exception("y는 0보다 크거나 같아야 해");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}}
	public static void main(String[] args) {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
	}
}
/*
[문제] 제곱승 연산
- x의 y승을 처리한다.
-for문을 이용하여 처리한다.

[실행결과]
x 입력 : 2
y 입력 : 10       input()
=========================
2의10승은 xxx output
*/