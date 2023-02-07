package array;

import java.util.Arrays;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현금입력 : ");
		int cash = sc.nextInt();
		
		
		//배열만들기
		int[]lotto = new int[6]; //정수배열생성
		
		for(int k=1; k<=1000; k++) {
		// 난수 발생, 중복x
		for(int i=0; i<6; i++) {
			lotto[i]=(int)(Math.random()*45) + 1;//정수생성
			
			//중복체크
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--; 
				}
			}
		}
		Arrays.sort(lotto); //오름차순으로 정렬
		System.out.println(Arrays.toString(lotto));
		System.out.println();
		if(k%5==0) System.out.println();
		}
		}
	
}
/*
[문제]로또 - 자동
-	크기가 6개인 배열 생성
-	1~45 사이의 난수 발생
-	숫자는 오름차순하여 출력 (Selection Sort)
-	출력시 자리수는 5자리로 지정
-	중복 숫자가 나오면 안된다
-	천원당 1중이나온다
-	5줄마다 줄바꿈
[실행결과]
현금 입력 : 5000
2	4	19	39	43	44
*/