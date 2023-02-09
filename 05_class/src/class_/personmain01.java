package class_;

class Person{
	private String name = null; //필드 , 초기값
	private int age = 0;
   // void 는 나오는 결과가 없으면 void 이다

	//메소드 구현
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	
	
	public void setData(String n , int a) {
		name = n;
		age = a;
	}// overload 위에꺼아래께
	public void setData() {}
	
	
	
	public String getName(){
		return name; //반환값
		
	}
	public int getAge() {
		return age;
	}


}
public class personmain01 {

	public static void main(String[] args) {
		Person a; //객체 선언
		a = new Person();; //객체 생성		
		System.out.println("객체 a =" + a);
		a.setName ( "홍길동"); //  호출 = 호출한 함수는 반드시 제자리로 옴
		a.setAge ( 25);// 호출
		System.out.println("이름=" +a.getName() +"\t나이=" + a.getAge());
		
		Person b = new Person();
		System.out.println("객체 b =" + b);
		b.setName ( "코난"); //  호출 = 호출한 함수는 반드시 제자리로 옴
		b.setAge ( 13);// 호출
		System.out.println("이름=" +b.getName() +"\t나이=" + b.getAge());
		
		Person c = new Person();
		System.out.println("객체 c = "+ c);
		c.setData("둘리", 100);
		System.out.println("이름=" +c.getName() +"\t나이=" + c.getAge());
		
		Person d = new Person();
		System.out.println("객체 d = "+ d);
		d.setData();
		System.out.println("이름=" +d.getName() +"\t나이=" + d.getAge());
	}

}
