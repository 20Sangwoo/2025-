package day9.exam1.person;
/*
    가상 세계에 가상 객체를 만드는 방법
    현실 / 상상 세계의 대상(객체) -> 추상화 ->클래스(개념 정의) -> 인스터슨화 -> 인스턴스(가상 객체)

    클래스(class) : 개념(명사, 동사) 설계 도구
    객체(object) : 실세계의 객체, 가상 세계의 객체
    인스턴스(instance) : 가상 세계의 객체 하나 하나를 가리킬 때
    
    생성자(constructor) 메소드 : 인스턴스를 생성하고, 인스턴스의 초기값을 설정하는 역할
    생성자 오버로딩(overloading) : 동일한 이름으로 매개변수의 갯수, 타입을 달리하여 여러 개를
                                정의할 수 있는 문법
    this : class에 정의된 개념을 기반으로 생성될 객체
    this() : 생성될 객체의 생성자 호출
    
    멤버(member) : 클래스 내에 정의된 필드, 메소드
 */

public class Person extends Object {
  // 필드(field) : 속성 정의
  private String name;
  private int age;
  private String nickname;
  
  // 생성자(constructor)
  // 기본 생성자
  Person() {
    super();
  }

  Person(String name) {
    super();
    this.name = name;
  }

  Person(String name, int age) {
//    super();
    this(name); // 다른 생성자 메소드 호출 : 코드 재사용성
    this.age = age;
  }
  
  // 메소드(method) : 행위 정의
  void smile() {
    System.out.println("웃다");
  }
  void eat() {
    System.out.println("먹다");
  }

  String getName() {
    return name;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getNickame() {
    return nickname;
  }
}
