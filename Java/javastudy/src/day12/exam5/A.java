package day12.exam5;

public interface A {
  void method();
  default void method2(){
    System.out.println("기능2");
  };
  static void method3(){
    System.out.println("기능3");
  }
}