package while_;

public class dowhile {

	public static void main(String[] args) {
		int a = 0;
		do {
			a++;
			System.out.print(a + " ");
	}while(a<10);
		System.out.println();
	/////////////////////////////////////////////////	
		
		
		//ABCDEFG~~~Z
		//1줄에 7개씩 출력을 하셈
		char ch = 'A';
		int count = 0;
		do {
			System.out.print(ch + " ");
			ch++;
			count++; // 개수 - 1 2 3 
			if(count%7==0)System.out.println();
			
		}while(ch<='Z');
		
		
		
		
}
}
