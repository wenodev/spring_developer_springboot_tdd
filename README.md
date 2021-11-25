# 2017 SpringDeveloper TDD 강연 학습 레포

[강연보기](https://www.youtube.com/watch?v=s9vt6UJiHg4&list=LL&index=11)

## TDD는 분명 좋다. 하지만 어렵다.
- 무엇을 테스트 해야할지 모른다.
    - 데이터베이스 테스트?
    - 외부 라이브러리 테스트?
- 복잡한 테스트 시나리오
- 유닛 테스트 vs 통합테스트

## 앞으로 Top-down 방식으로 설명할 것이다.

## 검증밥법
1. AAA(Arrange-Act-Assert)
2. GWT(Given-When-Then)   
  
두가지 방법 다 **준비-실행-검증**을 나타낸다.  
테스트 측면에서 두 가지 패턴 사이에 차이는 없지만 프로그래머가 아닌 사람들에게 GWT 구조가 더 읽기 쉽다. (단위테스트 81p)

## @ExceptionHandler
- spring-boot-starter-web의 spring-web package에 존재한다.
- 특정한 핸들러 클래스 혹은 핸들러 메소드에서 예외를 처리하기위한 Annotaion이다.
- @RestController와 @Controller에있는 Bean에서 NullPointer가 발생한다면 @ExcceptionHandler가 적용된 메서드가 호출된다.
- [공식문서 보러가기](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ExceptionHandler.html)

## @RestControllerAdvice
- spring-boot-starter-web의 spring-web package에 존재한다.
- 모든 RestController, Controller에서 발생하는 예외를 처리할 때 사용한다.
- @ControllerAdvice에 @ReseponseBody가 추가된 것이 @RestControllerAdivce이다.
- [공식문서 보러가기](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestControllerAdvice.html)

## ServiceTest
- Controller는 @SpringBootTest 혹은 @WebMvcTest를 사용함으로써 Spring을 사용하는 테스트를 할 수 밖에없지만, Service를 테스트 할 때는 Mockito를 적극적으로 활용해서 가벼운 테스트를 환경을 만들 수 있다.
- 가장 빠른 테스트 방법은 Spring과 관계없는 테스트를 작성하는 것이다.

## Describe-Context-It
- 테스트 코드의 함수명을 작성할 땐 DCI 패턴을 작성하는 것이 좋다.
- @Nested 어노테이션을 활용하는 방법이 가장 좋다고 생각한다.
- [참고자료](https://johngrib.github.io/wiki/junit5-nested/)
