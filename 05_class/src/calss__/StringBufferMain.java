package calss__;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력 : ");
		int dan = sc.nextInt();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer();  // buffer = " " 처리함 // append() = 추가한다 // delete() 삭제 
		for(int i=1; i<=9; i++) {
			
			//System.out.println(dan+ "*" + i + "=" + dan*i);
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); //StringBuffer -> String 변환
			
			buffer.delete(0, buffer.length()); // 몇번부터 몇번!!!
			
			
		}//for 
	}
	
	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain(); //클래스 메모리 만들어줘야하고 ()안에 생성자가 호출됨
		sbm.input();
		sbm.output();

	}

}
/*
[문제] 구구단
원하는 단을 입력 :  5                // input()
---------------------------------------------------------
                                //  output()
5*1=5
5*2=10

5*9=45



*/