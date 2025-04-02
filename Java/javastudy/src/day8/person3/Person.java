package day8.person3;
/*
  class 정의시 컴파일러가 자동으로 넣어주는 코드
  1. import java.lang.*;
  2. extends Object;
  3. default 생성자 메소드 : 클래스명과 동일한 이름의 메소드로 매개변수가 없는 메소드
 */
import java.lang.*;

public class Person extends Object{
  String name;

  Person(){
    super();
  }

  Person(String name) {
    this.name = name;
  }
}
