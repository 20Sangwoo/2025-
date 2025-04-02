package day8.person2;

public class Person {
  // 필드 : 객체의 속성 정의 , 데이터, 정보
  String name;
  int age;

  // 생성자 : 객체를 생성하는 역할
  // 디폴트 생성자 메소드 :
     // 1. 매개변수가 없다.
     // 2. 생성자가 하나라도 존재하지 않으면 컴파일러가 자동생성해준다.
  Person(){
    super(); // 부모 생성자 메소드
  }
  Person(String name){
    super();
    // this : 생성될 객체
    this.name = name;
  }
  Person(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  // 메소드 : 객체의 행위,역할,기능 정의
  void eat(){
    System.out.println("먹다");
  }
  void smile(){
    System.out.println("먹다");
  }
}
