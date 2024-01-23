# SpringStudy

# 찾는 능력 기르기

## Spring.io

Spring Boot - Learn - Reference Documentation 에서 기능 보기


## 정적 컨텐츠
파일 그대로 웹브라우저에 그대려 내려주는 것

## MVC와 템플릿 엔진
HTML을 그냥 주는게 아니라 서버에서 프로그래밍 해서 HTML을 동적으로 바뀌서 내리는 것을 템플릿 엔진</br>
컨트롤러,템플릿 엔진, 화면 이 세 가지를 모델뷰 컨트롤러, MVC라고 합니다.

## API
JSON이라는 데이터 구조 포맷으로 클라이언트한테 데이터를 전달하는게 API </br>
요즘엔 Vue나 React, Vue.js,React이런 것들을 쓸 때도 </br>
요즘에는 API로 데이터만 내려주면 화면은 클라이언트가 알아서 </br>
정리하는 방식들을 할때도 API 방식을 많이 사용</br>
서버끼리 통신할떄 사용

## @ResponseBody 
http 바디부에 이 데이터를 내가 직접 넣어 주겠다는 뜻

## 회원가입
ifPresent은 값이 null이 아닌 값이 있으면 실행됨

## 스프링 통합 테스트
@SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행한다.
@Transactional : 테스트 케이스에 이 애노테이션이 있으면, 테스트 시작 전에 트랜잭션을 시작하고,
테스트 완료 후에 항상 롤백한다. 이렇게 하면 DB에 데이터가 남지 않으므로 다음 테스트에 영향을 주지
않는다.