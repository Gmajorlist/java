package array;

public class array01 {

	private static int i;

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5]; 
		System.out.println("배열명 ar =" + ar);
		
		ar[0] = 25;
		ar[1] = 37;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		
		System.out.println("배열크기=" + ar.length); //배열의 크기를 가져온다 
		for(int i =0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("거꾸로 출력");
	
		for(int i=ar.length-1; i>0; i--); {
			
			System.out.println("ar[" + i + "] =" +ar[i]);
		}
		System.out.println();
	
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++ ) {
			if(ar[i]%2 == 1 ) System.out.println("ar[" + i + "] = "+ ar[i]);
			
		}
		System.out.println();
		
		System.out.println("확장 for");
		for(int data: ar) {//ar 의 크기만큼 for문을 반복한다.
			System.out.println(data);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
