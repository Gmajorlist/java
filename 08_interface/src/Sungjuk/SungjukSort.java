package Sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukSort implements Sungjuk {

	@Override
	public void execute(ArrayList<SungjukDTO> arraylist) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("*********************************");
			System.out.println("1.총점으로 내림차순");
			System.out.println("2.이름으로 오름차순");
			System.out.println("3.이전 메뉴");
			System.out.println("**********************************");
			num =sc.nextInt();
			
			if(num == 3 ) break;
		}//while
	}


}
