package interface_;

import java.util.Scanner;

public class Sum implements Compute {
	private int x, y;
	
	public Sum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 값 입력 :");
		x = sc.nextInt();
		System.out.println("y의 값 입력 :");
		y = sc.nextInt();
	}
	

	public static void main(String[] args) {
		System.out.println(x + "+" + y + "=" + (x+y));

	}


	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

}
