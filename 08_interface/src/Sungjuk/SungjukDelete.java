package Sungjuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungjukDelete {

		public void execute(ArrayList<SungjukDTO> arrayList) {
			System.out.println();
			System.out.println();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("삭제 할 이름 입력 : ");
			String name = sc.next();
			
			int count =0;
//			for(int i=0; i<arrayList.size(); i++) {
//				if(arrayList.get(i).getName().equals(name)){
//					arrayList.remove(i);
//					count++; // 1 2 3 
//				}
//			}//for
			
		}
		
		Iterator<SungjukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungjukDTO sungjukDTO = it.next();
			
			if(sungjukDTO.getName().equals(name)) {
				it.remove();
				count++;
			}
			if(count==0)
				System.out.println("회원정보가 없다");
			else
				System.out.println(count+"건을 삭제");
		}
}


