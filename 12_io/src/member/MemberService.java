package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	
	private MemberDTO[] ar = new MemberDTO[7];
	
	
	public void menu() {
		List<MemberDTO>list = new ArrayList<MemberDTO>(); //부모 = 자식
		Scanner sc = new Scanner(System.in);
		Member member = null; //부모잡아줘
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println("  1.등록");
			System.out.println("  2.출력");
			System.out.println("  3.핸드폰 검색");
			System.out.println("  4.이름으로 검색");
			System.out.println("  5.파일저장");
			System.out.println("  6.파일읽기");
			System.out.println("  7.끝");
			System.out.println("*************");
			System.out.println(" 번호 : ");
			num = sc.nextInt();
			
			if(num == 7)break; 
			
			if(num == 1)member = new MemberInsert();
			else if(num == 2)member = new MemberPrint();
			else if(num == 3)member = new MemberPhoneSearch();
			else if(num == 4)member = new MemberNameAsc();
			else if(num == 5)member = new MemberFileOutput();
			else if(num == 6)member = new MemberFileInput();
			
			
			
			else {
				System.out.println("1번~6번만 입력");
				continue;
			}
			member.execute(list);
			
		}//while	
		
	}//menu()

}
