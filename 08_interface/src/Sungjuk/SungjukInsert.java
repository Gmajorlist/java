package Sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukInsert implements Sungjuk {
	@Override
	public void execute(ArrayList<SungjukDTO>arraylist) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		System.out.println("번호 입력 : ");
		int no =sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 입력 : ");
		int math = sc.nextInt();
		
		SungjukDTO sungjukDTO = new SungjukDTO(no,name,kor,eng,math);
		sungjukDTO.calc();
		
		arraylist.add(sungjukDTO);
		
		System.out.println("저장하였습니다.");
	}

	

}
