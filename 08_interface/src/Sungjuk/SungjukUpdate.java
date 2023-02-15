package Sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukUpdate implements Sungjuk {
	private SungjukDTO sungjukDTO;

	@Override
	public void execute(ArrayList<SungjukDTO> arrayList) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		System.out.println("번호 입력 : ");
		int no =sc.nextInt();
		int i;
		for( i=0; i<arrayList.size(); i++) {
			if(arrayList.get(i).getNo()==no)break;
		}//for
		if(i==arrayList.size()) 
			System.out.println("없어 번호");
		else
			System.out.println(arrayList.get(i));
		System.out.println();
		System.out.println("바꿀 이름 입력 : ");
		String name = sc.next();
		System.out.println("바꿀 국어 입력 : ");
		int kor = sc.nextInt();
		System.out.println("바꿀영어 입력 : ");
		int eng = sc.nextInt();
		System.out.println("바꿀 수학 입력 : ");
		int math = sc.nextInt();
		
		sungjukDTO.setName(name);
		sungjukDTO.setKor(kor);
		sungjukDTO.setEng(eng);
		sungjukDTO.setMath(math);
		
		sungjukDTO.calc();
		
		System.out.println("수정했다");
	}
	if(sw == 0)
		Syste.out.pritln("없다 번호");
}
