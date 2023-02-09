package constructor;

public class varargs {
	public varargs() {
		System.out.println("기본 생성자");
	}
	//int sum(int a, int b) {
	//	return a+b;
	//}
	//int sum(int a, int b, int c) {
	//	return a+b+c;
	//}
	//int sum(int a, int b, int c, int d) {
	//	return a+b+c+d;
	//이게 함수 return형 메소드명(인수형 인수, 인수형 인수 , 인수형 인수)
	//}
	public int sum(int...ar) {
		int hap = 0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
	}
		return hap;
	}	
	public static void main(String[] args) {
		varargs va = new varargs(); // 생성자 부름
		System.out.println("합 = " + va.sum(10, 20));
		System.out.println("합 = " + va.sum(10, 20, 30));
		System.out.println("합 = " + va.sum(10, 20, 30, 40));
		
		
	}

}
