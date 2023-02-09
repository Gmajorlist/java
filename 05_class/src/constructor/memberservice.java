package constructor;

import java.util.Scanner;

public class memberservice {
	private memberDTO[] ar = new memberDTO[5];// 객체 배열
	
	public memberservice() {
		System.out.println("기본 생성자");
		
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("******************");
			System.out.println("    1. 가입");
			System.out.println("    2. 출력");
			System.out.println("    3. 수정");
			System.out.println("    4. 탈퇴");
			System.out.println("    5. 끝내기");
			System.out.println("******************");
			num = sc.nextInt();
			
			if(num == 5)break; //while 벗어나라
			if(num == 1)insertArticle();
			else if(num == 2 )list();
		}//while
}	// menu
	public void list() {
		
		
	}

	public void insertArticle() {
		
		
	}
}