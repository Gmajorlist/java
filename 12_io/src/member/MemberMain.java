package member;

public class MemberMain {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ms.menu(); //메뉴 함수갔다가 while 에서 빙글돌다가 다시 옴
		System.out.println("프로그램을 종료합니다.");


}}
/*
[문제] 회원관리

#조건
- 회원의 데이터를 입력 받아서 파일에 저장하거나 파일의 내용을 읽어본다.
- MemberService 클래스에 메뉴 메소드 작성한다.
  메뉴에 따라 각각의 클래스를 작성한다.
- 회원의 정보는 이름, 나이, 핸드폰, 주소로 한다.

1. 클래스 작성
MemberMain.java

MemberService.java
-메뉴작성

MemberDTO.java
-필드 ,생성자, setter, getter

MemberInsert.java
MemberPrint.java
MemberPhoneSearch.java
MemberNameAsc.java
MemberFileInput.java
MemberFileOutput.java

2. 인터페이스 작성

Member.java
- 추상메소드 public void execute();

menu()
***************************************
1.등록
2.출력
3.핸드폰 검색
4.이름으로 검색
5.파일저장
6.파일읽기
7.끝
**************************************
번호:
*/