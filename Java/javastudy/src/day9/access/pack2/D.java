package day9.access.pack2;

import day9.access.pack1.A;

public class D extends A {
  public void print() {
    System.out.println(a);
    System.out.println(b);     // 다른 패키지여도 상위 클래스 참조
//    System.out.println(c);    다른 패키지 접근 X
//    System.out.println(ㅇ);    다른 패키지 접근 X
  }
}
