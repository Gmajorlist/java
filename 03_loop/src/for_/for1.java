package for_;

public class for1 {

	public static void main(String[] args) {
		int i;
		for( i=1; i<=10; i++){
			System.out.println("What did you do saying motherfucker??");
		}	
		System.out.println("탈출 i =" + i);
		// local variable (지역변수)
		// 구역{} 구역을 벗어나면 소멸
		System.out.println();
		
		//10987654321
		for(i=10; i>=1; i--) {
			System.out.print(i+" ");
		} // println 로하면 밑으로 내려서 나옴 그래서 빼라
		System.out.println();

		//ABCDEFG~~~~~~Z
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		
	
	}
}
	