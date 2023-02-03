package operator;

public class Operator5 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = " + a );
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple"; //literal 생성
		String c = new String("apple"); //heap 영역 
		
		String result = b == c ?  "참" : "다르다";
		//주소를 물어보는 것이고 안에 있는 데이터를 묻는게 아님 // "주소를 비교 하는 것이다." 
		System.out.println("b == c : " + (b != c ? "참 " : "거짓"));
		
		String result2 = b.equals(c) ? "같다" : "다르다";
		System.out.println("b.equals(c) : " +  result);
		System.out.println("!b.equals(c) : " +  (!b.equals(c) ? "참 " : "거짓"));
		System.out.println();
		
	}

}
