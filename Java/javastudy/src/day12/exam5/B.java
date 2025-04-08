package day12.exam5;

public class B implements A{
  @Override
  public void method() {
    System.out.println("기능1");
  }

  @Override
  public void method2() {
    A.super.method2();
    System.out.println("기능2 개선");
  }
}