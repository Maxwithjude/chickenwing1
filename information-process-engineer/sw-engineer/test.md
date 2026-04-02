## 블랙박스 테스트 기법

- 동치 분할
- 경계값 분석
- 원인-효과 그래프
-

## 통합 테스트

- 상향식은 테스트 드라이버
- 하향식은 스텁

regression - 반복 테스트

## 애플리케이션 성능

- 시간 내 처리량 throughput
- 요청 시간부터 응답 도착 시간 차 response time
- 작업 의뢰 시 부터 처리 완료 시까지 경과시간 turn around time

## 코드 품질 분석

- 정적 코드 분석 : 코드 실행 x 스타일, 결함 탐색, 동적 코드분석 : 코드 실행하며 분석 추적

## ROLLBACK

- 트랜잭션이 실패한 경우 작업 취소 이전 상태 복구

## 암호화 알고리즘

- 라이, 메시 개발 = IDEA
- NSA 개발 알고리즘 IC칩 내장, Skipjack
- IBM 개발 64비트 = DES
- NIST 개발 AES

## SECURITY

- ARP 스푸핑 = LAN 사용 ARP 프로토콜 취약점 이용한 고역ㄱ
- LAND 어택 - 패킷 출발 주소, 포트를 동일하게. 무한 응답 패킷 전송

- 사회공학 = 깊은 신뢰를 이용해 비기술적 시스템 침입 수단
- 다크 데이터 - 활용 X 저장만 되어 있는 대량의 데이터

## SQL

CREATE INDEX idx_name ON student(name);
SELECT name, score FROM 성적 ORDER BY 점수 DESC;
SELECT _ FROM 회원 WHERE 이름 LIKE '이%' ORDER BY 가입일 DESC;
SELECT 학과, COUNT(_) AS 학과별튜플수 FROM 학생 GROUP BY 학과
SELECT 과목이름, MIN(점수) AS 최소점수, MAX(점수) AS 최대점수 FROM 성적 GROUP BY 과목이름
HAVING AVG(점수) >= 90;
