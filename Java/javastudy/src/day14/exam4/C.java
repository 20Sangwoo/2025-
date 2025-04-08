package day14.exam4;

public class C implements A {
  @Override
  public void method1() {
  }

  @Override
  public void method2() {
    A.super.method2();
    System.out.println("추가 작업");
  }
}
