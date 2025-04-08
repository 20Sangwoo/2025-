package day14.exam4;

public interface A {
  void method1();
  
//  default : 기존 구현 클래스에 영향을 주지 않고 기능을 추가하기 위한 유지보수 용도
  default void method2() {
    System.out.println("method2");
  }

//  static : 편의 기능
  static void method3() {
    System.out.println("method3");
  }
}
