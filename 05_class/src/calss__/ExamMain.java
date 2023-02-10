package calss__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 입력 : ");
		int cn = sc.nextInt();

	}//객체 배열

}
/*
[문제]
-총 5문제의 답을 입력받는다.
-정답은 "11111" 이다
- 맞으면 o 틀리면 x 
-1문제당 점수는 20점씩처리

클래스명 : Exam
 * 필드
private String name = null; 
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 를 이용하여 이름과 답을 입력받는다.
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 2 

이름 입력 : 홍길동
답 입력 : 12311

이름 입력 : 코난
답 ㅇㅂ략 : 24331

이름  1 2 3 4 5 점수

*/