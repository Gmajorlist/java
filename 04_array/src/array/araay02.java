package array;

public class araay02 {

	public static void main(String[] args) {
		String[] ar = {"호랑이", " 사자","코끼리"," 기린"," 하이에나","간팔원숭이" ,"고릴라" 
	};
		for(int i =0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = "+ ar[i]);
			System.out.println("문자열에 크기 = " + ar[i].length());
			System.out.println("첫번째 문자 =" + ar[i].charAt(0));
			System.out.println("마지막 문자 =" + ar[i].charAt(ar[i].length()-1));
			System.out.println();
			
			
		}//for
		System.out.println("확장 for");
		for(String data : ar) {
			System.out.println(data);
		}

}
}