package calss__;

import java.util.Scanner;

public class Exam {
	private String name = null; 
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG = "11111"; // 대문자로 나온건 상수 / 절대 값을 바꿀 수 없음
	// Exam  앞에 void 붙이면 x 
	Exam(){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력 : " );
		this.name = sc.next();
		System.out.println("답 입력 : ");
		this.dap = sc.next();
		
		ox = new char[5]; // 생성
	}
	public void campare() {
		for(int i=0; i<ox.length; i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else 
				ox[i] = 'X';
		}
	}
	public String getname(){
			return name;
		}
	public char[] getOx(){
		return ox;
	}
	public int getScore() {
		return score;
	}
		
	
	
	

}
