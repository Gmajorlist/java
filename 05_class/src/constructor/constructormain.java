package constructor;

public class constructormain {
	private String name;
	private int age;
	
	public  constructormain() {
		System.out.println("default 생성자");
	} // 생성자 overload 
	public constructormain(String name) {
		this();
		System.out.println("name 처리 생성자");
		this.name = name;
	}
	public constructormain(int age) {
		this("코난");
		System.out.println("age 처리 생성자");
		this.age = age;
		  //overload된 다른 생성자를 호출할 수 있다.
	}
	public static void main(String[] args) {
		constructormain aa = new constructormain();
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println();
		
		constructormain bb = new constructormain("홍길동");
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println();
	
		constructormain cc = new constructormain(25);
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println();
		
		
	}

}
