package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		int money;
//		키보드 -System in 
//		화면 - System out    
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner 클래스를 생성
		System.out.print("돈 입력 : ");
		money = scan.nextInt();
		
		DecimalFormat d = new DecimalFormat();
		
		System.out.println("현금:" + d.format(money) + "원");
		System.out.println("천원:" + money/1000 +"장" );
		System.out.println("백원:" + money%1000/100 +"개" );
		System.out.println("십원:" + money%100/10 + "개");
		System.out.println("일원:" + money%10+ "개");
		

	}

}


/*
[문제]동전교환현금 5378원이 있다

[실행결과] 
현금 : 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개

*/