package calss__;
class Fruit{ //1인분
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumjan, sumfeb, summar;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum=pum;
		this.jan=jan;
		this.feb=feb;
		this.mar=mar;
		//데이터들을 필드에 보관
	}
	public void calctot() {
		tot = (jan + feb + mar);
		sumjan += jan; 
		sumfeb += feb;
		summar += mar;
	}
	public void display() {
		System.out.println(pum + "\t" + jan+ "\t" +feb+ "\t" +mar+ "\t" +tot);
	}
	public static void output() {
		
	}
}
/////////////////////////////////////////////////////////
public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = {new Fruit	("사과" ,100, 80,75),	new Fruit("포도" , 30 ,25, 10),new Fruit("딸기" ,25, 30,90)};
		
		System.out.println("======================================");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("=======================================");
		for(Fruit data : ar) {
			data.calctot();
			data.display();
		}
		System.out.println("========================================");
		Fruit.output();
		
	
	}
}
/*
[문제] 과일 판매량 구하기 
월별 매출합계도 구하시오
클래스 : Fruit
필드  : pum jan feb mar tot
	  sumjan sumfeb summar

메소드 : 생성자 (품명, 1월, 2월 ,3월)
		calcTot()
		display()
		public static void output()
클래스 : FruitMain

[실행결과]
------------------------
PUM		JAN		FEB		MAR		TOT
사과		100		80		75		255
포도		30		25		10		XXX
딸기		25		30		90		XXX


*/
  
