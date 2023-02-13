package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); = 추상클래스라 생성이안돼
		 
		//3자리마다 ,찍고 소우이하 3째자리 츨력
 		NumberFormat nf = new DecimalFormat();//sub class 이용
 		System.out.println(nf.format(12345678.456789));
 		System.out.println(nf.format(12345678));
 		System.out.println();
 		
 		//유효숫자가 아닌것은 표현하지 않는다.
 		NumberFormat nf2 = new DecimalFormat("#,###.##원");
 		System.out.println(nf.format(12345678.456789));
 		System.out.println(nf.format(12345678));
 		System.out.println();
 		
 		//0을 강제로표시
 		NumberFormat nf3 = new DecimalFormat("#,###.00원");
 		System.out.println(nf.format(12345678.456789));
 		System.out.println(nf.format(12345678));
 		System.out.println();

 		// 메소드 이용하여 생성
// 		NumberFormat nf4 = NumberFormat.getInstance();
 		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//₩
 		nf4.setMaximumFractionDigits(2);//소수 이하 2째 자리
 		nf4.setMinimumFractionDigits(2);//
 		System.out.println(nf4.format(12345678.456789));
 		System.out.println(nf4.format(12345678));
 		System.out.println();
 		
// 		NumberFormat nf5 = NumberFormat.getInstance(Locale.US);
 		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//$
 		nf5.setMaximumFractionDigits(2);//소수 이하 2째 자리
 		nf5.setMinimumFractionDigits(2);//
 		System.out.println(nf5.format(12345678.456789));
 		System.out.println(nf5.format(12345678));
 		System.out.println();
 		
 		
	}

}
