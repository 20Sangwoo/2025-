package day12.exam1;

import java.lang.*;
/*
  abstract class(추상 클래스) : 미완성 클래스
    1.객체 생성 불가
    2.클래스 멤버중 미완성 메소드가 하나라도 존재하면 추상 클래스 여야 한다.
    3.타입으로는 사용가능
  abstract method(추상 메소드) : 미완성 메소드 (본문 없이 선언부만 존재하는 메소드)
 */
abstract class Animal extends Object{
  Animal(){
    super();
  }
  abstract void makeSound();
}