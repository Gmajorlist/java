package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length >= 2) {	
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
	System.out.println();
	
	try {
		int num1 = Integer.parseInt(args[0]);
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num2 = sc.nextInt();
	
		System.out.println(num1 + "  / " + num2 + " = " + (num1/num2));
	}catch(NumberFormatException e) {
		System.out.println("반드시 숫자로 입력"); 
		e.printStackTrace();//error 메시지 나오게함
		
	}catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없네");
		e.printStackTrace();
	}finally {
		System.out.println("error가 뭐어쩌라고 실행해");
	}
	}
}