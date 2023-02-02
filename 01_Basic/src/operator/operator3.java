package operator;

public class operator3 {

	public static void main(String[] args) {
		int a=5;
		a +=2;//a = a+2; ++a / a++
		a *=3;
		a /=5;
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		
		int b = a++; 
		System.out.println("a = " + a + " b = " + b);
		
		int c = ++a * b--;
		// ++a  7 
		// int c = a* b  7 * 5 
		// b-- 4
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a );
		
		
		

	}

}
