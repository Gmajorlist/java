package Basic;

public class MethodTest {

	public static void main(String[] args) {
		// 25, 36의 큰값을 구하시오 
		int big = Math.max(25, 36);
		System.out.println("최대값 = " + big);
		
		
		// 25.8, 78.6의 작은값을 구하시오 
//		double small = Math.min(25.8,78.6);
		float small =(float) Math.min(25.8, 78.6);
		System.out.println("최소값 = " + small);
	
//		250을 2진수로 출력하시오 toBinaryString
		String binary = Integer.toBinaryString(250);
		System.out.println("2진수 = " + binary);
		String oct = Integer.toOctalString(250);
		System.out.println("8진수 = " + oct);
		String hex = Integer.toHexString(250);
		System.out.println("16진수 = " + hex);
//		16진수 fa << 2진수에서 1111 1010 /1111 = 15(f) / 1010=10 (a)
		
		
		
		
		
		
		
		
		
	}

}
