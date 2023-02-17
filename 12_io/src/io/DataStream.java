package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			//파일출력
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			FileOutputStream fos = new FileOutputStream("result.txt");//파일로 나가세요 fileoutputstream
			DataOutputStream dos = new DataOutputStream(fos);//메소드가 더 많이 있어
			
			dos.writeUTF("홍길동");
			dos.writeInt(23);
			dos.writeDouble(184.2);
			
			dos.close(); // close 마무리를 했다.
			//파일 읽기
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			
			System.out.println("이름 = "+ name);
			System.out.println("나이 = " + age);
			System.out.println("키 = " + height);
			
			
		}catch(IOException e )	{
			e.printStackTrace();
		
		}	
	}
		

}
