package for_;

import java.util.Scanner;

public class for3 {

	public static void main(String[] args) {
		int i , sum = 0 ,mul = 1; 
		
		for(i=1; i<=10; i++) {
			sum += i;
			mul*=i;
			System.out.println(i+"\t"+sum+"\t"+mul);
		
		}
		
		
		
		
		
		/*
		i=1; 
		sum = sum +1; //1
		//누적 되고있다 새꺄
		i=2; 
		sum = sum +1; //3
		
		i=3; 
 		sum = sum +1; //6
		*/
	}

}
