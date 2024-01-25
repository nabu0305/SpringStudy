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
@SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행한다.</br>
@Transactional : 테스트 케이스에 이 애노테이션이 있으면, 테스트 시작 전에 트랜잭션을 시작하고,</br>
테스트 완료 후에 항상 롤백한다. 이렇게 하면 DB에 데이터가 남지 않으므로 다음 테스트에 영향을 주지</br>
않는다.

## 스프링 JdbcTemplate
순수 Jdbc와 동일한 환경설정을 하면 된다.</br>
스프링 JdbcTemplate과 MyBatis 같은 라이브러리는 JDBC API에서 본 반복 코드를 대부분</br>
제거해준다. 하지만 SQL은 직접 작성해야 한다.</br>

## JPA
JPA는 기존의 반복 코드는 물론이고, 기본적인 SQL도 JPA가 직접 만들어서 실행해준다.</br>
JPA를 사용하면, SQL과 데이터 중심의 설계에서 객체 중심의 설계로 패러다임을 전환을 할 수 있다.</br>
JPA를 사용하면 개발 생산성을 크게 높일 수 있다.</br>

DB가 아이디를 자동으로 생성해주는 거를 아이덴티티전략라이라고한다</br>

JPA 주의할 점 트랜잭션이라는게 있는데 서비스 계층에 골뱅이 트랜잭션 데이터를 저장하고 변경할 때 항상 트랜잭션이 있어야함</br>

org.springframework.transaction.annotation.Transactional 를 사용하자.</br>
스프링은 해당 클래스의 메서드를 실행할 때 트랜잭션을 시작하고, 메서드가 정상 종료되면 트랜잭션을</br>
커밋한다. 만약 런타임 예외가 발생하면 롤백한다.</br>
JPA를 통한 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다.


## 스프링 데이터 JPA 제공 기능
인터페이스를 통한 기본적인 CRUD</br>
findByName() , findByEmail() 처럼 메서드 이름 만으로 조회 기능 제공</br>
페이징 기능 자동 제공</br>
