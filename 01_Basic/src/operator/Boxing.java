package operator;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a / 3; // Casting 강제형 변환 / 자동형 변환
		//////////////////////
		String c = "25";
		
		//int d = c;   // c가 String 형이기 때문에 d 로 들어갈수가없다 
		// 기본형 = 객체형 
		//int d = (int)c; // (기본형)객체 는 안먹힘 error
		
		int q = Integer.parseInt(c); //이렇게 바꿔줘야함 
/*///////////////////////////////////////////////////////////////
		25 ----25+""-------------------> "25"
	    25 <---Integer.parseInt("25")--- "25"	
*/////////////////////////////////////////////////////////////////
		int d = Integer.parseInt(c);
		
		int e = 5;
		Integer f = e; // JDK 5.0 AutoBoxing (기본형 -> 객체형)
		//객체형      =  기본형 
		Integer g = 5;
		int h = g; //JDK 5.0 UnAutoBoxing (객체형 -> 기본형)
		
		
		
		
	}

}

















