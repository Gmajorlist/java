package class_;

import java.util.Scanner;

public class computermain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수 입력 : ");
		int count = sc.nextInt();
		
		computer[]ar = new computer[count];//배열생성 
		
		for(int i=0; i<count; i++) {
			System.out.println("[" + i + "번째]");
			System.out.print("x 입력 : " );
			int x = sc.nextInt();
			System.out.print("y 입력 : ");
			int y = sc.nextInt();
			System.out.println();
			
			//클래스 생성
			ar[i] = new computer();
			ar[i].setData(x,y);
			ar[i].calc();
			
			
		}// for i
		
		//출력
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
		for(computer data : ar) {
			System.out.println(data.getx() + "\t"
					+data.gety() + "\t"
					+data.getsum() + "\t"
					+data.getsub() + "\t"
					+data.getmul() + "\t"
					+data.getdiv() + "\t"
					);
		}
				
	}}	
		
		
	
		
			
	

/*
[문제] 사칙연산
x, y를 입력하여 합, 차, 곱, 몫을 구하시오

클래스명 : Compute (1인분)
필드 : x, y, sum, sub, mul, div
메소드 : setData(x의 값, y의 값)
        calc()
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
클래스명 : ComputeMain        

[실행결과]
횟수 입력 : 2

[1번째]
x 입력 : 25
y 입력 : 36

[2번째]
x 입력 : 35
y 입력 : 12

x   y   sum      sub      mul      div
25   36
35   12
*/