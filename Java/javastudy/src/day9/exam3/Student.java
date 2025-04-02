package day9.exam3;

public class Student extends Person {
  // 메소드 오버라이딩 (메소드 재정의) : 메소드 선언부가 부모 메소드의 선언부랑 동일해야 한다.
  //                                접근 제한자는 동일하거나 범위가 더 커야한다.
  @Override
  public void eat() {
    System.out.println("더 먹는다");
  }
  void study() {
    System.out.println("공부하다");
  }
}
