package inheritance;

class Test extends Object{
	
}

/////////////////////////
class Sample{
	
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
	
}
//////////////////////////
class Exam{
	private String name = "홍길동";
	private int age = 25;
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}

public class ObejctMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t); //클래스@명16진수
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode());
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		
		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());
		System.out.println();
// 문자열은 무한대이기 때문에 여기서는 10진수 주소는 가짜이다 믿지마라	
		String aa = "apple";
		System.out.println("객체 aa = " + aa); //문자열 자체적으로 override함
		System.out.println("객체 aa = " + aa.toString());
		System.out.println("객체 aa = " + aa.hashCode());//문자열은 무한대이기때문에 10진수를 믿지말자
		System.out.println();
// 
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc :" + (bb==cc)); //주소 - false
		System.out.println("bb.equals(cc) : " + bb.equals(cc)); //문자열 - true
		System.out.println();
	
// equals = 문자열일 때 만 비교 합니다.
		Object dd = new String("apple");
		Object ee = new String("apple");
		System.out.println("dd==ee :" + (dd==ee)); //주소 - false
		System.out.println("dd.equals(cc) : " + dd.equals(ee)); //주소 - false
		System.out.println();
//문자열로 비교 되는 이유가 뭘까요 - 		
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff==gg :" + (ff==gg)); //주소 - false
		System.out.println("ff.equals(gg) : " + ff.equals(gg)); //문자열 - true
		System.out.println();
		
	}
	
	

}
/*
class Obeject{
	public String tostring(){}
	public int hashCode(){}
	public boolean equals(Obeject ob){}

	
	
	
	
 */





