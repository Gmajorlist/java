package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(23);
			dos.writeDouble(184.2);
			
			dos.close();
			
		}catch(IOException e )	{
			e.printStackTrace();
		
		}	
	}
		

}
