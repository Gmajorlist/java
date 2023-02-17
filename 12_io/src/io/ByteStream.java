package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
// throws 이용
	public static void main(String[] args)throws IOException{
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt")); // 두가지 방법이 있어
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		
		int data; // 객체일 때 null // int 마지막일 때 -1 해라
		
		while((data = bis.read()) != -1) {
			//A를 가져옴 65가 -1이 아니다 해서 계속 돌아 while
			
			System.out.print((char)data); // 13 10 << Enter 기능 = 다음줄 \n , 맨앞 \r 두가지 동작이 있음 그래서 13과10이 출력할 때 나옴
			//(char)를 넣으면 문자 형태로 보여줍니다 아닐때는 (data)쓰면 됩니다.
		}
		System.out.println();
		
	}

}

