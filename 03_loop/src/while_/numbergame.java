package while_;

import java.util.Scanner;

public class numbergame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, user, count=0 ;
		
		
		while(true) {
					com = (int)(Math.random()*100 + 1 ); //1 부터 100까지 난수가 나옴 공식 
					
					System.out.println("1~100사이의 숫자를 맞추세요");
					System.out.println();
					while(true) {
						System.out.println("숫자 입력 : ");
						user = sc.nextInt();
						count++; // count = count + 1 
						if(com == user) break; 
						
						if(com < user) System.out.println(user +"보다 작은 숫자");
						else if(com > user) System.out.println(user + "보다 큰 숫자 ");
						
		}
		System.out.println("\n 딩댕댕 " + count+ " 번만에 맞춤");
		
		System.out.println("\n 한번 더 (y/n : )");
		int yn = sc.nextInt(); // y or n
		//String yn = sc.nextInt();
		if(yn == 'n' || yn == 'N') break;
		//if(yn.equals("n")|| yn.equals("N"))break;  이건 문자열꺼야 
		}
		System.out.println("프로그램을 종료함");
		}
		
		
		
	
		
	

}
/* 숫자 맞추기 게임
컴터 1~ 100사이의 난수가 발생하면 발생한 난수를 맞추는 게임 
몇번만에 맞춘지 출력

- 1~100사이의 숫자를 맞추세요 

숫자입력 : 50 
50보다 큰 숫자입니다.

숫자입력 : 85 
85보다 작은 숫자입니다.

숫자입력 : 70 
딩동댕 x 번만에맞추셨습니다.
*/