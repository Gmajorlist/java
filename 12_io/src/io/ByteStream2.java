package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
// try catch 이용
	public static void main(String[] args) {
		try {// 파일크기 잡는방법 바로 아래봐
			File file = new File("data.txt");//data.txt 파일의 크기를 알아야해 근데 찾아갈 방법이없어 주소를 ... 
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int)file.length(); //파일 크기  //배열만 괄호가 안들어감
			//file.length Long 이어서 int에 안들어가요 // 그래서 (int)형변환 시켜준다.
			byte[] b = new byte[size];
			
			bis.read(b,0,size);
			//데이터가 배열b로 들어감 배열명은 주소를가지고있어 그래서 sysout하면 주소나옴 
			System.out.println(new String(b)); //byte[] -> String 변환해 >> (new String) 넣어 !!
			bis.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
