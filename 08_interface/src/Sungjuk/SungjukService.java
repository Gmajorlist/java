package Sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukService {
	private ArrayList<SungjukDTO> arraylist = new ArrayList<SungjukDTO>();	
	
	
	
		public void menu() {
			Scanner sc = new Scanner(System.in);
			Sungjuk sungjuk = null;
			int num ; 
			
			while(true) {
				System.out.println();
				System.out.println("************");
				System.out.println("  1.합");
				System.out.println("  2.차");
				System.out.println("  3.곱");
				System.out.println("  4.몫");
				System.out.println("  5.끝내기");
				System.out.println("*************");
				System.out.println(" 번호 : ");
				num = sc.nextInt();
				
				if(num == 6) break;
				
				if(num == 1) 
					sungjuk = new SungjukInsert();
				else if(num == 2) 
					sungjuk = new SungjukList();
				else if(num ==3);
					sungjuk = new SungjukUpdate();
				else if(num ==4);
				else if(num ==5);
				else {
					System.out.println("1번~6번까지만 입력하세여");
					continue;
					
				}
				sungjuk.execute(arraylist);//호출
//			1.입력
//			2.출력
//			3.수정
//			4.삭제
//			5.정렬
//			6.끝
		}

	}

}
