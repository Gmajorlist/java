package member;

import java.util.List;
import java.util.Scanner;

public class MemberInsert implements Member{

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력  : ");
		String name = sc.next();
		System.out.println("나이 입력  : ");
		int age = sc.nextInt();
		System.out.println("핸드폰 입력  : ");
		String phone = sc.next();
		System.out.println("주소 입력  : ");
		String address = sc.next();
		
		MemberDTO memberDTO = new MemberDTO(name, age, phone, address);
		
		list.add(memberDTO);
		
		System.out.println("입력 완료");
		
	}



	

}
