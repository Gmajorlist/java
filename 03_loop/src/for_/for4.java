package for_;

import java.util.Scanner;

public class for4 {

	public static void main(String[] args) {
		int mul=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 :");
		int x = sc.nextInt();
		System.out.print("y값 입력 :");
		int y = sc.nextInt();
		
		for(int i=1; i<=y; i++) {
			
			mul*=x;
					
	}

		System.out.println(x +"의" + y + "승은" + mul);
		
	}}
/*
[문제] 제곱 계산 - x의 y승

x값 입력 :2 
y값 입력 :5

2의 5승은 32
-----------
x값 입력 :3
y값 입력 :4

3의 4승은 81
*/