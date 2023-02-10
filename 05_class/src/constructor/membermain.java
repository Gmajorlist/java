package constructor;

public class membermain {

	public static void main(String[] args) {
		memberservice ms = new memberservice();
		ms.menu();
		System.out.println("프로그램을 종료합니다.");
		// 항상 일하는 집합체한테 일을 넘김
		//간단하게 함 서비스가 일을 다함
		//static < 시음식이라고 생각하면됨 굳이 new 필요가 없음
		// static 밑에 private 들어가면 new를 해줘야함 
		//
		
	}

}
/*

*/
