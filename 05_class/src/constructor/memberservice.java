package constructor;

import java.util.Scanner;

public class memberservice {
	Scanner sc = new Scanner(System.in);
	private memberDTO[] ar = new memberDTO[5];// 객체 배열
	
	public memberservice() {
		System.out.println("기본 생성자");
		
	}
	public void menu() {
	
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
			if(num == 1)insert();
			else if(num == 2 )list();
			else if(num == 3 )update();
		}//while
}	// menu
	public void update() {
		System.out.println("핸드폰 번호 입력 : ");
		String phone = sc.next();
		
		int i;
		for( i=0; i<ar.length; i++) {
			if(ar[1] != null) {
				if(ar[i].getPhone().equals(phone)) {
					System.out.println(ar[i].getName()+ "\t"
							+ar[i].getAge()+ "\t"
							+ar[i].getPhone()+ "\t"
							+ar[i].getAddress());
					break;
				}
			}
		}//for i
		if(i == ar.length) System.out.println("찾는 회원이 없습니다.");
		
	}
	public void list() {
		//for(int i=0; i<ar.length; i++) 
		for(memberDTO dto : ar) {
			if(dto !=null) {
				System.out.println(dto.getName()+ "\t"
						+dto.getAge()+ "\t"
						+dto.getPhone()+ "\t"
						+dto.getAddress());
			}
		}
	}

	public void insert() {
		int i ;
		for( i =0; i<ar.length; i++) {
			if(ar[i] == null) break;
		}
		if( i == ar.length) {
			System.out.println(ar.length +"명의 정원이 꽉 찼습니다.");
			return; //함수를 벗어나라
		}
		//데이터 입력
		System.out.println(" 이름 입력 : " );
		String name = sc.next();
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		System.out.println("핸드폰 입력 : ");
		String phone = sc.next();
		System.out.println("주소 입력");
		String address = sc.next();
		
		//memberDTO 클래스 생성
		for( i =0; i<ar.length; i++) {
			if(ar[i] ==null) {
				ar[i]= new memberDTO(name,age,phone,address);
				break; //for 벗어나라
			}
		}
		
		
		
		System.out.println("1 row created");
	}
}