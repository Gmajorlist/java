package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("백터 크기 = " +v.size()); // 0
		System.out.println("백터 용량 = " + v.capacity()); // 기본용량은 10
		System.out.println();
	
		System.out.println("항목 추가");
		for(int i=0; i<10; i++) {
			v.add(i+""); // Sting으로 바꿔줄때  i+""
			System.out.print(v.get(i)+" ");
			System.out.println("백터 크기 = " +v.size()); // 0
			System.out.println("백터 용량 = " + v.capacity()); // 기본용량은 10
			System.out.println();
		}
		System.out.println("항목 1개 추가");
		v.addElement(5+""); //중복 허용
		System.out.println("백터 크기 = " +v.size()); 
		System.out.println("백터 용량 = " + v.capacity()); 
		System.out.println();
		
		for(int i=0; i<v.size(); i++)	
			System.out.print(v.get(i)+" ");
		System.out.println();
		
		System.out.println("마지막 항복 삭제");
//		v.remove("5"); - 앞 부분의 "5" 항복이 삭제
		v.remove(10); //10번 위치의 항목을 삭제
		Iterator<String> it = v.iterator();//생성
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
	}
	
	

}
