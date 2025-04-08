package day12.exam3;

import java.util.Random;

public class Test {
  int x;
  // 인스턴스 블럭 : 인스턴스 필드를 초기화하는 용도
  {
    Random random = new Random();
    y = random.nextInt(10)+1;
    System.out.println("instance 블럭 실행됨");
  }

  static int y;
  // 정적 블럭 : 정적 필드를 초기화하는용도
  static {
    Random random = new Random();
    y = random.nextInt(10)+1;
    System.out.println("static 블럭 실행됨");
  }

  public Test() {
    this.x = 20;
    System.out.println("Test() 실행됨");
  }
  public Test(int x) {
    this.x = x;
    System.out.println("Test(int x) 실행됨");
  }
}