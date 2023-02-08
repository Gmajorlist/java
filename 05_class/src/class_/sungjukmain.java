package class_;

public class sungjukmain {

	public static void main(String[] args) {
		sungjuk aa = new sungjuk();
		aa.setData("홍길동", 90,95,100);
		aa.calc();
		System.out.println(aa.getName()+"\t"
				+aa.getKor()+"\t"
				+aa.getEng()+"\t"
				+aa.getMath()+"\t"
				+aa.getTot()+"\t"
				+aa.getGrade());
		
		sungjuk bb = new sungjuk();
		aa.setData("홍길동", 90,95,100);
		aa.calc();
		System.out.println(bb.getName()+"\t"
				+bb.getKor()+"\t"
				+bb.getEng()+"\t"
				+bb.getMath()+"\t"
				+bb.getTot()+"\t"
				+bb.getGrade());
		
		sungjuk cc = new sungjuk();
		aa.setData("홍길동", 90,95,100);
		aa.calc();
		System.out.println(cc.getName()+"\t"
				+cc.getKor()+"\t"
				+cc.getEng()+"\t"
				+cc.getMath()+"\t"
				+cc.getTot()+"\t"
				+cc.getGrade());
		
		
		
		
	}
	
	
}


/*
[문제] 성적 처리
- 총점, 평균, 학점을 구하시오
- 평균은 소수이하 2째자리까지 출력

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90 이상이면 'A'
      평균이 80 이상이면 'B'
      평균이 70 이상이면 'C'
      평균이 60 이상이면 'D'
      그외는 'F'
      
클래스명 : SungJuk
필드    : name, kor, eng, math, tot, avg, grade  
메소드   : setData(이름, 국어, 영어, 수학)
          calc() - 총점, 평균, 학점 계산
          getName()
          getKor()
          getEng()
          getMath()
          getTot()
          getAvg()
          getGrade()
         
클래스명 : SungJukMain         

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

*/