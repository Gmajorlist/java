package while_;

public class while1 {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		int a = 0;
		while(a < 10) {
			a++;
			System.out.print(a + "  ");
		} //while
	 System.out.println();
	

		
		
		a=0;
		while(true) {
			a++;
			System.out.println(a +  " ");
			if(a>=10)break; //while를 벗어나라
		}
	}
}