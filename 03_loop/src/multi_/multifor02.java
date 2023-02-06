package multi_;

public class multifor02 {

	public static void main(String[] args) {
		int dan, i;
		for(dan =2; dan <=9; dan++) {
			System.out.println("[" + dan + "단]");
			
		}
		System.out.println();
		for (i =1; i <=9; i++) {
			for(dan =2 ; dan <=9; dan++) {
				System.out.println(dan+ "*" + i + "=" + i*dan +"\t");
				
			}
			System.out.println();
		}
				
		
		
		
		
		

	}

}
/*
문제 - 2단 ~ 9단
2*1 = 2
2*2 = 4
*/


