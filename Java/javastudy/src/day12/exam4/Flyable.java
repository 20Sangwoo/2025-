package day12.exam4;
/*
  1. 객체 생성 불가
  2. 멤버로 상수필드 ,추상 메소드, 디폴트메소드 ,정적메소드가 올수 있다.
  3. 타입으로 사용가능.
  4. 모든 멤버는 public이다.(public 키워드가 없어도)
 */
public interface Flyable {
  //  public static final int field = 1;
//  int field2 = 2;   // public static final 생략 가능
//
//  pulbic abstract void method();
//  void method2();  // public abstract 생략 가능
  void fly();
}