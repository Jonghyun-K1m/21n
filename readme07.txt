1. 목표
 http방식의 통신환경에서 클라이언트와 서버 상호간의 인증, 통신의 암복호화를 지원
2. 필요지식
 2-a) JSP
 2-b) 암호화
 2-c) 인증
 2-d) java

updatenote

07/19
 1. 메인페이지와 서블릿간의 통신확인
  1-a) /hello 와 main.jsp
  
07/20
 1. properties파일을 통해 db설정확인
  1-a) properties 파일은 업로드하지않음
 2. db연결
  2-a) test.java를 통해 mysql과 연결확인
DONE. jsp->jsp->db 데이터( 7/21 완료)

07/21
 1.  jsp->jsp->db 데이터 조회성공
  1-a) 여태한 파일 주석처리 후 업로드
 2. jsp에서 로그인 세션관리 성공
  2-a) 안전성을 위해 서블릿에 요청하고 반환값만 받을 것 (jsp로 만든 세션관리 업로드x)
   => 로그인만 하는거면 자바 서블릿 유틸이용 ( 7/22 완료 )
 3. 웹페이지에서 로그인, 로그아웃, db조회, 삽입요청 -> 서블릿처리완료
DONE -a) 암호화 적용시 jar파일 형식을 적용 ( 7/23 완료 )
     -b) 암호화시 원하는 패딩추가 ( 7/23 완료 )
     
07/22
 1. RSA암호화방식 학습중
  1-a) 자바는 pkcs8형식의 파일 read가능 (헤더다른경우X)
  1-b) 파일에 저장된 형식 byte단위로 read후 Keyfactory이용 X509방식 
 => properties를 통해 서버의공개키, 내공개키,내개인키 호출
 => 서버의 공개키로 암호화하여 평문만들고 서버의 개인키로 복호화 확인
 DONE. 전송데이터에 대해 서버의 공개키로 암호화, 서버에서 개인키로 복호화 ( 07/28 완료 )
 
07/23
 1. 07/21 TODO 완료
 2. Client에서 전송시 보내는 형식(폼)에 대해 학습
  DONE . jsp 전송폼에서 summit시에 js가 가로채서 데이터 암호화하는 방식으로 수행 
         => jsp에서 서블릿으로 전송시에 데이터를 암호화해서 보내는 방식으로 구현
  
  07/26~07/27
  1. js학습
  
  07/28
  1. jsp파일내 jar import  적용
  2. 로그인페이지에서 서버로 비밀번호를 보낼 때 서버의 공개키로 암호화하여 보냄
    TODO. 로그인에 대한 세션유지,  => 로그인한 계정에 대해 세션유지(07/28)
          세션키를 활용한 암호화,
          CA에 의한 키교환
           ★★★ 패키지명, 함수이름을 좀 잘 지어야함 ★★★
