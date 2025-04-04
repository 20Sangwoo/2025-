package day11.exam2;

import common.util.MyUtil;

public class Static1 {
  public static void main(String[] args) {
    MyUtil myUtil = new MyUtil();
//    인스턴스 멤버는 객체를 만들고 접근
    myUtil.printLine('*', 20);

//    정적 멤버는 객체 생성없이 접근
    MyUtil.printLine2('*', 10);
    System.out.println(MyUtil.cnt);
  }
}
