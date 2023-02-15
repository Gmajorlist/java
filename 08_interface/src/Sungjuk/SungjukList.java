package Sungjuk;

import java.util.ArrayList;

public class SungjukList implements Sungjuk{
	@Override
	public void execute(ArrayList<SungjukDTO>arraylist) {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
	//1번	///////////////////////////////////////////////
//		for(SungjukDTO sumgjukDTO:arraylist) {
//			System.out.println(sungjukDTO.getNo()+"\t"
//								+sungjukDTO.getName()+"\t"
//								+sungjukDTO.getKor()+"\t"
//								+sungjukDTO.getEng()+"\t"
//								+sungjukDTO.getMath()+"\t"
//								+sungjukDTO.getTot()+"\t"
//								+sungjukDTO.getAvg()+"\t");
//			
		}
		//2번///////////////////////////////
		for(SungjukDTO sumgjukDTO:arraylist) {
			System.out.println(sungjukDTO);//
		}
		
		
		
		
		
		
		
		
		//3번//////////////////////////////
//		for(int i =0; i<arraylist.size(); i++);{
//			System.out.println(arraylist.get(i).getNo()+"\t"
//					+arraylist.get(i).getName()+"\t"
//					+arraylist.get(i).getKor()+"\t"
//					+arraylist.get(i).getEng()+"\t"
//					+arraylist.get(i).getMath()+"\t"
//					+arraylist.get(i).getTot()+"\t"
//					+arraylist.get(i).getAvg()+"\t");

//	}
		}
	

}
