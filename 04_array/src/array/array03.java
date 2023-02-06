package array;

import java.util.Scanner;

public class array03 {

	private static String min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size ; 
		int[]ar ; 
		int sum =0;
	
		System.out.println("배열 크기 입력 :");
		size = sc.nextInt();
		ar = new int[size]; //배열생성
		
		for(int i=0; i<size; i++) {
			System.out.print("ar[i]입력 :");
			ar[i] = sc.nextInt();
			
			sum +=ar[i];
		}//for
		
		//최대값

		int max = ar[0];
		for(int i=1; i<ar.length; i++) {
		if(ar[1] > max)max= ar[1]; 
	
		//최소값
		int min = ar[0];
		
		if(ar[1]<min) min = ar[i];
		}	
		
		for(int data : ar ) {
			System.out.print(data +" ");
		}
		
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

}
/*
[묹제] 배열의 크기를 입력받아서 배열을 생성한다.

[실행결과]
배열 크기 입력 : 3

ar[0] 입력 :25 
ar[1] 입력 :13
ar[2] 입력 :57

25 13 57 
합 = xxx


*/

