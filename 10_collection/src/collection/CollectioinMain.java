package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectioinMain {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {	
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복 허용
		coll.add(25);
		coll.add(43.54);
		
		
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
		
	}

}
