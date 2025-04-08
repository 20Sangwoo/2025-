package day14.exam3;

public class C implements A, B {

  @Override
  public void methodC() {
    System.out.println("methodC");
  }

  @Override
  public void methodA() {
    System.out.println(A.MAX);
    System.out.println(B.MAX);
    A.super.methodA();
    B.super.methodA();
  }
}
