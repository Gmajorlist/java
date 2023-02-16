package collection;

import java.util.LinkedList;

public class QueueMain {
public static void main(String[] args) {
	String[]item = {"소나타","렉스톤","재규어"};
	LinkedList<String> q = new LinkedList<String>();
	
	for(String n : item) //{}중괄호를 안쓴 이유는 한번만 쓴다는말
		q.offer(n); //요소 추가
	System.out.println("q의 크기 : "+q.size()+"\n");
	String data="";
	
	while((data = q.poll()) != null) {
		System.out.println(data+"삭제!");
		System.out.println("q의 크기 :" + q.size()+"\n");
	}
}
}
