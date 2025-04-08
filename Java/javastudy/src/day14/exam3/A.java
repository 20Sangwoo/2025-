package day14.exam3;

public interface A {
  int MAX = 100;  // public static final 생략

  void methodC();   //public abstract 생략
  default void methodA() {
    System.out.println("interface A");
  }

  static void staticMethodA() {}
}
