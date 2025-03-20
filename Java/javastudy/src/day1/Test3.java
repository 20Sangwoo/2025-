package day1;

public class Test3 {
  public static void method() {
    System.out.println("1");  // 문자열 ""
    System.out.println('1');  // 문자 ''
  }
  public static void method2() {
    System.out.println("2");
  }
  public static void main(String[] args) {
    System.out.println("main");
    method();
    method2();
  }
}
