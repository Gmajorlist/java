package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); // 중복 허용
//		list.add(25);
//		list.add(43.54);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//확장형 for문
		for(String s : list) {
			System.out.println(s);
			
		}
		
		
	}

}
