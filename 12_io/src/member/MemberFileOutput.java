package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput implements Member {

	@Override
	public void execute(List<MemberDTO> list) {

			System.out.println();
			
			try { //throws 쓰면 연쇄반응으로 일어나서 다 고쳐야함 .. 그래서 try catch씀
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt")); 
				for(MemberDTO memberDTO : list) {
					oos.writeObject(memberDTO);
					
				}
				oos.close();
				System.out.println("파일 저장 완료 ");
				
			}catch(IOException e ) {
				e.printStackTrace();
			}
			}

	

	}

	