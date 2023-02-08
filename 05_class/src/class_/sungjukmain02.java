package class_;

public class sungjukmain02 {

	public static void main(String[] args) {
		sungjuk[] ar = new sungjuk[3]; //객체 배열
		// new는 배열을 생성
		ar[0] = new sungjuk(); //클래스 생성
		ar[0].setData(null, 0, 0, 0);
		
		ar[1] = new sungjuk(); //클래스 생성
		ar[1].setData(null, 0, 0, 0);
		
		ar[2] = new sungjuk(); //클래스 생성
		ar[2].setData(null, 0, 0, 0);
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
			System.out.println(ar[1].getName()+"\t"
				+ar[1].getKor()+"\t"
				+ar[1].getEng()+"\t"
				+ar[1].getMath()+"\t"
				+ar[1].getTot()+"\t"
				+ar[1].getGrade());
		}
		
		

	}

}
