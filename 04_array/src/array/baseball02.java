package array;

import java.util.Scanner;

public class baseball02 {

	public static void main(String[] args) {
		int[] com = new int[3]; //컴터 1차 배열
		int[] user = new int[3]; // 유저 1차 배열
		Scanner sc = new Scanner(System.in);
		String yn;
		int strike = 0;
		int ball = 0 ;
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = sc.next();
		}while(!yn.equals("Y")&&!yn.equals("y")&&!yn.equals("N")&&!yn.equals("n"));
		if(!yn.equals("Y")||!yn.equals("y")) {
			System.out.println("게임을 시작합니다");
//              컴퓨터가 난수 발생 
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9+1);
				//중복제거
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--;
						break; //for   j 를 벗어나라
					}
				}//for j
			}//for i
			System.out.println(com[0]+ "," + com[1]+ "," + com[2]);
			
			// 사용자 숫자 입력 
			while(true) {
				System.out.println();
				System.out.print("숫자입력 : ");
				int num = sc.nextInt();
				
				user[0] = num/100;
				user[1] = (num%100)/10;
				user[2] = (num%100)%10;
//				user[0] = num.charAt(0)-48; // 문자
//				user[1] = num.charAt(1)-48;
//				user[2] = num.charAt(2)-'0';
				System.out.println(user[0] + "," + user[1] + "," + user[2]);
				
				//비교
				strike = ball =0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						
						if(com[1] == user[j]) {
							if(i == j ) strike++;
							else ball++;
						}
					}// for j
				}// for i
				System.out.println(strike + "스트라이크\t" + ball + "볼");
				
				if(strike == 3 ) {
					System.out.println("정답!");
					break; // while를 벗어나라
				}
			}//while
		
		}else
			System.out.println("프로그램을 종료합니다");

	}

}
