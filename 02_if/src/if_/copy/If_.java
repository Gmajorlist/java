package if_.copy;
import java.util.Scanner;

public class If_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int a = sc.nextInt();
		
		
		if(a >= 50) System.out.println(a + "는 50보다 크거나 같다");
		System.out.println(a + "는 50보다 작다");
		System.out.println();
		
		
		//c
		if(false)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		//A -> C
		if(true)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		// B-> C
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		
		if(a>='A' && a<='Z')//(a가 대문자입니까  'A' 'B' 'C'..'Z'90)  // 65 ~ 90
			System.out.println((char)a + "는 대문자");
		else if(a>='a' && a<='z') //97 ~122
			System.out.println((char)a + "는 소문자");
		else
			System.out.println((char)a + "는 숫자이거나 특수문자");
		
		
		
	}

}
